
export class Stack {
  #items;

  constructor() {
    this.#items = [];
  }

  // Adiciona um elemento ao topo da pilha
  push(element) {
    this.#items.push(element);
  }

  // Remove e retorna o elemento do topo da pilha
  pop() {
    if (this.isEmpty()) {
      return undefined;
    }
    return this.#items.pop();
  }

  // Retorna o elemento do topo sem removê-lo
  peek() {
    if (this.isEmpty()) {
      return undefined;
    }
    return this.#items[this.#items.length - 1];
  }

  // Verifica se a pilha está vazia
  isEmpty() {
    return this.#items.length === 0;
  }

  // Retorna a quantidade de elementos na pilha
  size() {
    return this.#items.length;
  }

  // Limpa todos os elementos da pilha
  clear() {
    this.#items = [];
  }

  // Retorna a pilha em formato de texto para depuração
  toString() {
    return this.#items.toString();
  }
}