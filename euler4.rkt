;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-intermediate-lambda-reader.ss" "lang")((modname euler5) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #f #t none #f ())))
;;Takes the first n elements of a list
(define (take lst n)
  (cond
    [(empty? lst) empty]
    [(= 0 n) empty]
    [else (cons (first lst) (take (rest lst) (sub1 n)))]))

;;Checks if a list of characters is a palindrome
(define (palindrome-loc? loc)
  (equal? (take loc (ceiling (/ (length loc) 2)))
          (take (reverse loc) (ceiling (/ (length loc) 2)))))

;;Checks if a string is palindrome
(define (palindrome? str)
  (palindrome-loc? (string->list str)))

(check-expect (palindrome? "austin") false)
(check-expect (palindrome? "ada") true)
(check-expect (palindrome? "beeb") true)

;;Removes all duplicates in a list
(define (dedup lst)
  (foldr (lambda (x y) 
           (cond 
             [(member? x y) y]
             [else (cons x y)])) empty lst))

;;Finds all multiples between two numbers
(define (all-multiples-between num1 num2)
  (local [(define (countup num1 num2)
            (cond [(= num1 num2) (list num1)]
                  [else (cons num1 (countup (add1 num1) num2))]))]
    (sort (dedup (foldr (lambda (x y) (append x y)) empty
                        (map (lambda (x) 
                               (map (lambda (y) (* x y)) (countup num1 num2))) 
                             (countup num1 num2)))) <)))

;;Find the last object in a list
(define (last lst)
  (cond
    [(empty? (rest lst)) (first lst)]
    [else (last (rest lst))]))



(all-multiples-between 1 10)
(check-expect (last (filter palindrome? (map (lambda (x) (number->string x)) (all-multiples-between 10 99)))) "9009")

;;Finds the largest palindrome made by the products of 900 and 999
(last (filter palindrome? (map (lambda (x) (number->string x)) (all-multiples-between 900 999))))