import { BTreeNode } from './BTreeNode.js';

export class BTree {
  /**
   * @param {number} t Grau mínimo (t >= 2)
   */
  constructor(t = 3) {
    if (t < 2) {
      throw new Error('O grau mínimo t deve ser >= 2');
    }
    this.t = t;
    this.root = null;
  }

  // Busca uma chave na árvore
  search(k) {
    return this.root ? this.root.search(k) : null;
  }

  // Insere uma nova chave na árvore B
  insert(k) {
    // Caso 1: Árvore vazia
    if (!this.root) {
      this.root = new BTreeNode(this.t, true);
      this.root.keys.push(k);
      return;
    }

    // Caso 2: Raiz está cheia (precisa dividir e criar nova raiz)
    if (this.root.keys.length === 2 * this.t - 1) {
      const newRoot = new BTreeNode(this.t, false);
      newRoot.children.push(this.root);
      newRoot.splitChild(0, this.root);

      let i = 0;
      if (newRoot.keys[0] < k) {
        i++;
      }
      newRoot.children[i].insertNonFull(k);
      this.root = newRoot;
    } else {
      // Caso 3: Raiz não está cheia
      this.root.insertNonFull(k);
    }
  }

  // Imprime a estrutura da árvore em formato hierárquico
  printTree(node = this.root, indent = '') {
    if (!node) {
      console.log('Árvore vazia.');
      return;
    }

    console.log(`${indent}[${node.keys.join(', ')}]`);
    if (!node.isLeaf) {
      for (const child of node.children) {
        this.printTree(child, indent + '    ');
      }
    }
  }
}