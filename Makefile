start:
	@docker build -t task-manager:latest task-manager-backend
	@docker-compose -f docker/docker-compose.yaml up --detach backend

stop:
	@docker-compose -f docker/docker-compose.yaml stop
