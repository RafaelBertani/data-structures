import { Stack } from './Stack.js';

const stack = new Stack();

console.log('--- Inserindo elementos ---');
stack.push(10);
stack.push(20);
stack.push(30);

console.log('Conteúdo da pilha:', stack.toString()); // 10,20,30
console.log('Tamanho da pilha:', stack.size());        // 3
console.log('Elemento no topo (peek):', stack.peek()); // 30

console.log('\n--- Removendo elementos ---');
console.log('Item removido (pop):', stack.pop());     // 30
console.log('Novo topo:', stack.peek());              // 20
console.log('Tamanho atual:', stack.size());          // 2

console.log('\n--- Limpando a pilha ---');
stack.clear();
console.log('A pilha está vazia?', stack.isEmpty());   // true