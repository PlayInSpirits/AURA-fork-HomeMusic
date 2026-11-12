.class public final La00;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:Ll61;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Z)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La00;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-boolean p2, p0, La00;->b:Z

    .line 7
    .line 8
    sget-object p5, Ln61;->a:Ljava/util/HashMap;

    .line 9
    .line 10
    const-class p5, Ln61;

    .line 11
    .line 12
    monitor-enter p5

    .line 13
    :try_start_0
    sget-object v0, Ln61;->b:Ljava/util/HashMap;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-static {v1, p1}, Ln61;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {v0, v2, p2}, Ljava/util/HashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    monitor-exit p5

    .line 28
    xor-int/lit8 p2, p6, 0x1

    .line 29
    .line 30
    invoke-static {v1, p1, p3, p4, p2}, Ln61;->h(ILjava/lang/String;ZLjava/lang/String;Z)Ll61;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, La00;->c:Ll61;

    .line 35
    .line 36
    return-void

    .line 37
    :catchall_0
    move-exception p0

    .line 38
    :try_start_1
    monitor-exit p5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    throw p0
.end method
