/**
 * Nó de uma Árvore B (B-Tree)
 */
export class BTreeNode {
  /**
   * @param {number} t Grau mínimo da árvore
   * @param {boolean} isLeaf Indica se é um nó folha
   */
  constructor(t, isLeaf = true) {
    this.t = t;
    this.isLeaf = isLeaf;
    this.keys = [];      // Armazena as chaves no nó
    this.children = [];  // Ponteiros para nós filhos
  }

  // Busca uma chave a partir deste nó
  search(k) {
    let i = 0;
    while (i < this.keys.length && k > this.keys[i]) {
      i++;
    }

    // Se encontrou a chave neste nó
    if (i < this.keys.length && this.keys[i] === k) {
      return { node: this, index: i };
    }

    // Se é folha e não encontrou, a chave não existe
    if (this.isLeaf) {
      return null;
    }

    // Desce recursivamente para o filho correspondente
    return this.children[i].search(k);
  }

  // Insere uma chave quando o nó NÃO está cheio
  insertNonFull(k) {
    let i = this.keys.length - 1;

    if (this.isLeaf) {
      // Insere a chave mantendo a ordenação
      this.keys.push(null);
      while (i >= 0 && this.keys[i] > k) {
        this.keys[i + 1] = this.keys[i];
        i--;
      }
      this.keys[i + 1] = k;
    } else {
      // Encontra o filho correto para descer
      while (i >= 0 && this.keys[i] > k) {
        i--;
      }
      i++;

      // Se o filho estiver cheio, divide-o antes de descer
      if (this.children[i].keys.length === 2 * this.t - 1) {
        this.splitChild(i, this.children[i]);

        if (this.keys[i] < k) {
          i++;
        }
      }
      this.children[i].insertNonFull(k);
    }
  }

  // Divide o filho y (que está cheio) deste nó
  splitChild(i, y) {
    const t = this.t;
    const z = new BTreeNode(t, y.isLeaf);

    // z recebe as últimas t-1 chaves de y
    z.keys = y.keys.splice(t);
    const medianKey = y.keys.pop(); // Chave mediana que subirá

    // Se y não for folha, z recebe os últimos t filhos de y
    if (!y.isLeaf) {
      z.children = y.children.splice(t);
    }

    // Insere z como filho deste nó logo após y
    this.children.splice(i + 1, 0, z);

    // Sobe a chave mediana para este nó
    this.keys.splice(i, 0, medianKey);
  }
}