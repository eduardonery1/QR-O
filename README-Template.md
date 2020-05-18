# QR-o

O QR-o é um sistema para agendamento de entregas à domicílio. O projeto que o originou foi criado durante o HACKCOVID19, como solução à dois desafios publicados no evento: o primeiro desafio propunha a criação de um aplicativo de entregas que valorizasse os entregadores e o segundo propunha a automatização do registro de entregas com respeito aos limites de distanciamento recomendados pela OMS. 

Esse sistema é composto por uma aplicação Android e serviços web atualmente disponibilizados em php, trandando-se do Produto Mínimo Viável (MVP) para a entrega do projeto ao HACKCOVID19. O sistema está disponível para dois usuários, o cliente e o entregador. Até o final do HACKCOVID19 este sistema permitia que um cliente solicitasse uma entrega de encomenda e que o entregador registrasse a entrega da mesma de forma segura no que tange a segurança sanitária. Para garantir o limite de distanciamento o registro é realizado através da leitura do QR-code gerado na solicitação da entrega.

O serviço web conta com ainda mais duas funcionalidades para o entregador: a lista de solicitações de entrega disponíveis para que ele possa escolher o trabalho que deseja realizar e o cadastro de entregas aceitas pelo entregador, a fim de que a mesma entrega não seja realizada por mais de um entregador. 

## Pré-requisitos

Para a executar esse sistema, é necessário ter o Android Studio para a aplicação Android e o Apache 2 e o PHP na versão 7 para o serviço web.

### Instalação

Basta instalar no Android o [aplicativo QR-o](https://github.com/eduardonery1/QR-O/blob/master/app-debug.apk).

Para o deploy do servidor, basta incluir o diretório [qr-o_server](https://github.com/eduardonery1/QR-O/tree/master/qr-o_server) no diretório de aplicações do Apache. O arquivo index.php permite o teste dos serviços já implementados. 

## Authors

* **Eduardo Nery** - [GitHub do Eduardo](https://github.com/eduardonery1)
* **Pedro Albuquerque** - [GitHub do Pedro](https://github.com/pedrowluan)
