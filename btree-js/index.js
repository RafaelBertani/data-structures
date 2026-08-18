import { BTree } from './BTree.js';

// Cria uma B-Tree com grau mínimo t = 3 (máx 5 chaves por nó)
const btree = new BTree(3);

const values = [10, 20, 5, 6, 12, 30, 7, 17, 3, 22, 27, 24, 15, 19, 25];

console.log('--- Inserindo valores ---');
values.forEach(val => btree.insert(val));

console.log('\n--- Estrutura da B-Tree ---');
btree.printTree();

console.log('\n--- Buscas ---');
console.log('Buscando 12:', btree.search(12) !== null ? 'Encontrado' : 'Não encontrado');
console.log('Buscando 99:', btree.search(99) !== null ? 'Encontrado' : 'Não encontrado');