.class public final Lcq1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lof4;


# instance fields
.field public final n:Lcc1;

.field public o:Z

.field public final synthetic p:Lhq1;


# direct methods
.method public constructor <init>(Lhq1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcq1;->p:Lhq1;

    .line 5
    .line 6
    new-instance v0, Lcc1;

    .line 7
    .line 8
    iget-object p1, p1, Lhq1;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Lew;

    .line 11
    .line 12
    invoke-interface {p1}, Lof4;->timeout()Lfu4;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-direct {v0, p1}, Lcc1;-><init>(Lfu4;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcq1;->n:Lcc1;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final L(Ltv;J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcq1;->p:Lhq1;

    .line 2
    .line 3
    iget-object v0, v0, Lhq1;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lew;

    .line 6
    .line 7
    iget-boolean p0, p0, Lcq1;->o:Z

    .line 8
    .line 9
    if-nez p0, :cond_1

    .line 10
    .line 11
    const-wide/16 v1, 0x0

    .line 12
    .line 13
    cmp-long p0, p2, v1

    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-interface {v0, p2, p3}, Lew;->C(J)Lew;

    .line 19
    .line 20
    .line 21
    const-string p0, "\r\n"

    .line 22
    .line 23
    invoke-interface {v0, p0}, Lew;->y(Ljava/lang/String;)Lew;

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, p1, p2, p3}, Lof4;->L(Ltv;J)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v0, p0}, Lew;->y(Ljava/lang/String;)Lew;

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    const-string p0, "closed"

    .line 34
    .line 35
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final declared-synchronized close()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lcq1;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    :try_start_1
    iput-boolean v0, p0, Lcq1;->o:Z

    .line 10
    .line 11
    iget-object v0, p0, Lcq1;->p:Lhq1;

    .line 12
    .line 13
    iget-object v0, v0, Lhq1;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lew;

    .line 16
    .line 17
    const-string v1, "0\r\n\r\n"

    .line 18
    .line 19
    invoke-interface {v0, v1}, Lew;->y(Ljava/lang/String;)Lew;

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcq1;->n:Lcc1;

    .line 23
    .line 24
    iget-object v1, v0, Lcc1;->e:Lfu4;

    .line 25
    .line 26
    sget-object v2, Lfu4;->d:Leu4;

    .line 27
    .line 28
    iput-object v2, v0, Lcc1;->e:Lfu4;

    .line 29
    .line 30
    invoke-virtual {v1}, Lfu4;->a()Lfu4;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Lfu4;->b()Lfu4;

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcq1;->p:Lhq1;

    .line 37
    .line 38
    const/4 v1, 0x3

    .line 39
    iput v1, v0, Lhq1;->a:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    .line 41
    monitor-exit p0

    .line 42
    return-void

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 45
    throw v0
.end method

.method public final declared-synchronized flush()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lcq1;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcq1;->p:Lhq1;

    .line 9
    .line 10
    iget-object v0, v0, Lhq1;->e:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lew;

    .line 13
    .line 14
    invoke-interface {v0}, Lew;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 21
    throw v0
.end method

.method public final timeout()Lfu4;
    .locals 0

    .line 1
    iget-object p0, p0, Lcq1;->n:Lcc1;

    .line 2
    .line 3
    return-object p0
.end method
