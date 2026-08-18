import { Queue } from './Queue.js';

const queue = new Queue();

console.log('--- Enfileirando clientes (Enqueue) ---');
queue.enqueue('João');
queue.enqueue('Maria');
queue.enqueue('Carlos');

console.log('Fila atual (Frente <- Trás):', queue.toString());
console.log('Tamanho da fila:', queue.size());
console.log('Quem é o próximo a ser atendido? (Front):', queue.front());

console.log('\n--- Atendendo clientes (Dequeue) ---');
console.log('Atendido:', queue.dequeue()); // João sai
console.log('Próximo da fila:', queue.front()); // Maria
console.log('Fila atual:', queue.toString()); 

console.log('Atendido:', queue.dequeue()); // Maria sai
console.log('Tamanho atual:', queue.size()); // 1

console.log('\n--- Limpando a fila ---');
queue.clear();
console.log('A fila está vazia?', queue.isEmpty());