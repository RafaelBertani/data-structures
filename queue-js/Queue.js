/**
 * Implementação de Fila (Queue) O(1) em JavaScript usando objeto
 */
export class Queue {
  #items;
  #head;
  #tail;

  constructor() {
    this.#items = {};
    this.#head = 0; // Índice do primeiro elemento
    this.#tail = 0; // Índice do próximo elemento a ser inserido
  }

  // Adiciona um elemento ao final da fila (O(1))
  enqueue(element) {
    this.#items[this.#tail] = element;
    this.#tail++;
  }

  // Remove e retorna o primeiro elemento da fila (O(1))
  dequeue() {
    if (this.isEmpty()) {
      return undefined;
    }
    
    const item = this.#items[this.#head];
    delete this.#items[this.#head];
    this.#head++;
    
    return item;
  }

  // Retorna o primeiro elemento sem removê-lo
  front() {
    if (this.isEmpty()) {
      return undefined;
    }
    return this.#items[this.#head];
  }

  // Verifica se a fila está vazia
  isEmpty() {
    return this.size() === 0;
  }

  // Retorna a quantidade de elementos
  size() {
    return this.#tail - this.#head;
  }

  // Limpa a fila
  clear() {
    this.#items = {};
    this.#head = 0;
    this.#tail = 0;
  }

  // Retorna os elementos em string para visualização
  toString() {
    if (this.isEmpty()) {
      return '';
    }
    
    const result = [];
    for (let i = this.#head; i < this.#tail; i++) {
      result.push(this.#items[i]);
    }
    return result.join(' <- '); // Indica o sentido (Frente <- Trás)
  }
}