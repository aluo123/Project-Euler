;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-intermediate-lambda-reader.ss" "lang")((modname euler40) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #f #t none #f ())))
;;Factorial Function
(define (factorial n)
  (foldr * 1 (build-list n add1)))

;;Sum of the digits of n
(define (digital-sum n)
  (cond [(= n 0) 0]
        [else (+ (remainder n 10) (digital-sum (quotient n 10)))]))