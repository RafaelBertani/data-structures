import { Node } from './Node.js';

/**
 * Lista Simplesmente Encadeada (Singly Linked List)
 */
export class LinkedList {
  #head;
  #size;

  constructor() {
    this.#head = null;
    this.#size = 0;
  }

  // Insere um elemento no final da lista - O(n)
  append(value) {
    const newNode = new Node(value);

    if (this.isEmpty()) {
      this.#head = newNode;
    } else {
      let current = this.#head;
      while (current.next !== null) {
        current = current.next;
      }
      current.next = newNode;
    }

    this.#size++;
  }

  // Insere um elemento no início da lista - O(1)
  prepend(value) {
    const newNode = new Node(value);
    newNode.next = this.#head;
    this.#head = newNode;
    this.#size++;
  }

  // Insere um elemento em uma posição específica (0-indexed)
  insertAt(value, index) {
    if (index < 0 || index > this.#size) {
      return false;
    }

    if (index === 0) {
      this.prepend(value);
      return true;
    }

    const newNode = new Node(value);
    let current = this.#head;
    let previous = null;
    let count = 0;

    while (count < index) {
      previous = current;
      current = current.next;
      count++;
    }

    newNode.next = current;
    previous.next = newNode;
    this.#size++;
    return true;
  }

  // Remove e retorna o elemento em um índice específico
  removeAt(index) {
    if (index < 0 || index >= this.#size || this.isEmpty()) {
      return undefined;
    }

    let current = this.#head;

    if (index === 0) {
      this.#head = current.next;
    } else {
      let previous = null;
      let count = 0;

      while (count < index) {
        previous = current;
        current = current.next;
        count++;
      }

      previous.next = current.next;
    }

    this.#size--;
    return current.value;
  }

  // Remove a primeira ocorrência do valor especificado
  removeValue(value) {
    const index = this.indexOf(value);
    if (index === -1) {
      return undefined;
    }
    return this.removeAt(index);
  }

  // Retorna o índice da primeira ocorrência do valor (-1 se não encontrar)
  indexOf(value) {
    let current = this.#head;
    let index = 0;

    while (current !== null) {
      if (current.value === value) {
        return index;
      }
      current = current.next;
      index++;
    }

    return -1;
  }

  // Retorna o elemento em um determinado índice sem removê-lo
  getAt(index) {
    if (index < 0 || index >= this.#size) {
      return undefined;
    }

    let current = this.#head;
    let count = 0;

    while (count < index) {
      current = current.next;
      count++;
    }

    return current.value;
  }

  // Verifica se a lista está vazia
  isEmpty() {
    return this.#size === 0;
  }

  // Retorna a quantidade de nós na lista
  size() {
    return this.#size;
  }

  // Limpa a lista
  clear() {
    this.#head = null;
    this.#size = 0;
  }

  // Permite iterar diretamente sobre a lista usando `for...of`
  *[Symbol.iterator]() {
    let current = this.#head;
    while (current !== null) {
      yield current.value;
      current = current.next;
    }
  }

  // Representação em string para visualização amigável
  toString() {
    if (this.isEmpty()) {
      return 'null';
    }

    const values = [];
    let current = this.#head;

    while (current !== null) {
      values.push(current.value);
      current = current.next;
    }

    return values.join(' -> ') + ' -> null';
  }
}