package tofu.systemenv

import cats.effect.std.Env

private[systemenv] class SystemEnvForCe3Env[F[_]](private val env: Env[F]) extends SystemEnv[F] {
  override def get(name: String): F[Option[String]] = env.get(name)
}
