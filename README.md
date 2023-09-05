# `kt-devenv`

This repo is to build the [`ghcr.io/dkorolev/kt-devenv:latest`](https://github.com/dkorolev/kt-devenv/pkgs/container/kt-devenv) container.

The container is running Alpine linux, uses the `u` username, and `/home/u` as the base dir.

The container is built by [this Github action](https://github.com/dkorolev/kt-devenv/actions/workflows/build-container.yml).

The container can be tested with [this Github action](https://github.com/dkorolev/kt-devenv/actions/workflows/test-container.yml).
