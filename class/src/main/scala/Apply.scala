package scalaz

abstract class Apply[F[_]] {
  def functor: Functor[F]
  def ap[A, B](f: F[A => B]): F[A] => F[B]
}