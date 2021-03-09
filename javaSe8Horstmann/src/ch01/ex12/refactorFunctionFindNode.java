/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   refactorFunctionFindNode.java                      :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: aberry <aberry@student.42.fr>              +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2021/03/09 22:59:00 by aberry            #+#    #+#             */
/*   Updated: 2021/03/09 22:59:00 by aberry           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

/**
 * В состав комплекта разработки Java Development Kit входит архивный
 * файл src.zip с исходным кодом библиотеки Java. Разархивируйте этот файл и
 * с по­мощью избранного вами инструментального средства для поиска текста
 * найди­те в этом исходном коде примеры применения последовательностей
 * операторов break и continue с меткой.
 * Выберите один из этих примеров и перепиши­те его без оператора с меткой.
 */

package ch01.ex12;

public class refactorFunctionFindNode {

/*Original version function findNode()
                            in java/util/concurrent/ConcurrentSkipListMap.java*/
/*
        private Node<K,V> findNode(Object key) {
            if (key == null)
                throw new NullPointerException(); // don't postpone errors
            Comparator<? super K> cmp = comparator;
            outer: for (;;) {
                for (Node<K,V> b = findPredecessor(key, cmp), n = b.next;;) {
                    Object v; int c;
                    if (n == null)
                        break outer;
                    Node<K,V> f = n.next;
                    if (n != b.next)                // inconsistent read
                        break;
                    if ((v = n.value) == null) {    // n is deleted
                        n.helpDelete(b, f);
                        break;
                    }
                    if (b.value == null || v == n)  // b is deleted
                        break;
                    if ((c = cpr(cmp, key, n.key)) == 0)
                        return n;
                    if (c < 0)
                        break outer;
                    b = n;
                    n = f;
                }
            }
            return null;
        }
*/

/**
 *                           Refactoring this function
 * line[12]:
 *       outer: for (;;) {             ->                      for (;;) {
 *
 * line[16]:
 *       break outer;                   ->                    continue;
 *
 * line[29]:
 *       break outer;                   ->                    continue;
 */

/*
        private Node<K,V> findNode(Object key) {
            if (key == null)
                throw new NullPointerException(); // don't postpone errors
            Comparator<? super K> cmp = comparator;
            for (;;) {
                for (Node<K,V> b = findPredecessor(key, cmp), n = b.next;;) {
                    Object v; int c;
                    if (n == null)
                        continue;
                    Node<K,V> f = n.next;
                    if (n != b.next)                // inconsistent read
                        break;
                    if ((v = n.value) == null) {    // n is deleted
                        n.helpDelete(b, f);
                        break;
                    }
                    if (b.value == null || v == n)  // b is deleted
                        break;
                    if ((c = cpr(cmp, key, n.key)) == 0)
                        return n;
                    if (c < 0)
                        continue;
                    b = n;
                    n = f;
                }
            }
            return null;
        }
*/
}
