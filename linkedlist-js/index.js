import { LinkedList } from './LinkedList.js';

const list = new LinkedList();

console.log('--- Inserções ---');
list.append(10);
list.append(20);
list.append(30);
console.log('Após append (10, 20, 30):', list.toString()); // 10 -> 20 -> 30 -> null

list.prepend(5);
console.log('Após prepend (5):', list.toString());         // 5 -> 10 -> 20 -> 30 -> null

list.insertAt(15, 2);
console.log('Após insertAt(15, 2):', list.toString());     // 5 -> 10 -> 15 -> 20 -> 30 -> null

console.log('\n--- Buscas ---');
console.log('Índice do valor 20:', list.indexOf(20));      // 3
console.log('Índice do valor 99:', list.indexOf(99));      // -1
console.log('Elemento no índice 2:', list.getAt(2));       // 15

console.log('\n--- Remoções ---');
console.log('Removido no índice 0:', list.removeAt(0));     // 5
console.log('Lista:', list.toString());                     // 10 -> 15 -> 20 -> 30 -> null

console.log('Removido valor 20:', list.removeValue(20));    // 20
console.log('Lista final:', list.toString());               // 10 -> 15 -> 30 -> null

console.log('\n--- Iterando com for...of ---');
for (const item of list) {
  console.log('Item:', item);
}