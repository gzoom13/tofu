package tofu.control

import cats.FlatMap
import tofu.compat.unused
import tofu.instances.bind._

class CatsInstancesFromBindSuite {
  def summonBindInstances[F[+_, +_]](implicit bind: Bind[F]): Unit = {
    requireApplicative[F[Throwable, *]]
    requireFlatMap[F[Nothing, *]]
  }

  def requireApplicative[F[_]](implicit @unused applicative: FlatMap[F]): Unit = ()

  def requireFlatMap[F[_]](implicit @unused applicative: FlatMap[F]): Unit = ()
}
