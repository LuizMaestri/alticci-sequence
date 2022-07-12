# Alticci Sequence

The Alticci sequence - a(n):

n = 0 => a(0) = 0

n = 1 => a(1) = 1

n = 2 => a(2) = 1

n > 2 => a(n) = a(n-3) + a(n-2)

## Run

```docker-compose up```

### Backend
- port - 8080
- swagger URL - /q/swagger-ui
- api URL - /api/alticci/{n}

### frontend
- port - 80