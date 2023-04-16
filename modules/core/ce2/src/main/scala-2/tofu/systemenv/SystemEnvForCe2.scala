package tofu.systemenv

import cats.effect.Sync

private[systemenv] class SystemEnvForCe2[F[_]](private val sync: Sync[F]) extends SystemEnv[F] {
  override def get(name: String): F[Option[String]] =
    sync.delay(Option(System.getenv(name)))
}
