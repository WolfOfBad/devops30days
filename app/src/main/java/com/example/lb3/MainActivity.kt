package com.example.lb3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: TipsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val tips = listOf(
            Tip(1, "Yandex Cloud", R.drawable.yandex_cloud, "Изучите сервисы и возможности облака Yandex cloud."),
            Tip(2, "Linux", R.drawable.linux, "Изучите архитектуру Linux, команды в терминале, работу с пользователями и модификаторы доступа."),
            Tip(3, "Nginx proxy", R.drawable.nginx1, "Изучите Nginx, настройте reverse proxy на свое приложение."),
            Tip(4, "Nginx upstream + regex", R.drawable.nginx2, "Изучите возможности балансировки и определения пути по регулярным выражениям в Nginx."),
            Tip(5, "Nginx authorization", R.drawable.nginx3, "Настройте механизм basic auth в nginx."),
            Tip(6, "Bash скриптинг", R.drawable.bash, "Напишите скрипты для автоматизации рутинных задач. Сделайте скрипты исполняемыми по расписанию."),
            Tip(7, "Python скриптинг", R.drawable.python, "Напишите скрипты на python для взаимодействия с ВМ."),
            Tip(8, "Networking, VPN", R.drawable.wireguard, "Настройте подключение к ВМ через бастион-хост по VPN."),
            Tip(9, "HA PostgreSQL", R.drawable.patroni, "Поднимите отказоустойчивый кластер postgres при помощи patroni + haproxy."),
            Tip(10, "Managed service for PostgreSQL", R.drawable.postgres, "Поднимите managed postgres. Настройте автоматические бэкапы с сохранением с S3."),
            Tip(11, "Application load balancer", R.drawable.alb, "Настройте ALB для доступа к ВМ через ALB + HTTPS."),
            Tip(12, "CDN", R.drawable.cdn, "Выгрузите свои статические файлы в CDN. Найстройте к ним доступ через ALB."),
            Tip(13, "Terraform", R.drawable.terraform, "Опишите и поднимите свою инфраструктуру при помощи Terraform."),
            Tip(14, "Terragrunt", R.drawable.terragrunt, "Изучите инструмент Terragrunt. Мигрируйте Terraform код на Terragrunt."),
            Tip(15, "Docker", R.drawable.docker, "Изучите принцип контейнеризации. Упакуйте свое приложение в контейнер, используя все известные bestpractices."),
            Tip(16, "Yandex Serverless", R.drawable.serverless, "Запустите свое приложение с использованием serverless технологии."),
            Tip(17, "Git", R.drawable.git, "Изучите сложные случаи применения git. Настройте git hooks."),
            Tip(18, "Ansible", R.drawable.ansible, "Напишите плейбуки для настройки ВМ, используя роли."),
            Tip(19, "Jenkins", R.drawable.jenkins, "Постройте CI/CD на Jenkins, автоматизируйте сборку и развертывание приложения в свое облако."),
            Tip(20, "Gitlab CI", R.drawable.gitlab, "Постройте пайплайны CI/CD, используя managed GitLab."),
            Tip(21, "Monitoring 1", R.drawable.pga, "Поднимите Prometheus + Alertmanager + Grafana. Настройте сбор метрик, дашборды, алерты для своего приложения."),
            Tip(22, "Monitoring 2", R.drawable.loki, "Поднимите Loki и настройте сбор метрик с приложения в S3."),
            Tip(23, "Monitoring 3", R.drawable.elk, "Поднимите ELK stack и настройте сбор метрик с приложения в S3."),
            Tip(24, "Kubernetes 1", R.drawable.k8s, "Изучите архитектуру kubernetes. Напишите манифесты для развертывания приложения в кластере."),
            Tip(25, "Kubernetes 2", R.drawable.helm, "Перенесите свои манифесты в Helm чарты и шаблониируйте параметры приложения."),
            Tip(26, "Kubernetes + Monitoring", R.drawable.k8s_monitoring, "Настройте мониторинг, подняв GPA + ELK в кластере. Настройте сохранение данных на отлельные диски."),
            Tip(27, "Kubernetes balancing", R.drawable.ingress, "Настройте доступ к приложению внутри кластера kubernetes через Ingress, связанный с ALB внутри облака."),
            Tip(28, "Kubernetes HPA", R.drawable.hpa, "Настройте HorizontalPodAutoscaler для подов внутри kubernetes."),
            Tip(29, "GitOps", R.drawable.argocd, "Мигрируйте свои helm чарты в ArgoCD с использованием подхода GitOps."),
            Tip(30, "CEPH", R.drawable.ceph, "Поднимите кластре CEPH и изучите способы хранения данных в нем.")
        )

        adapter = TipsAdapter(tips)
        recyclerView.adapter = adapter
    }
}
