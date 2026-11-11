.class public abstract Lqq2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final n:Landroid/content/Context;

.field public final o:Lom1;

.field public final p:Lzk;

.field public q:Lsi1;

.field public r:Lup2;

.field public s:Z

.field public t:Lxk0;

.field public u:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lom1;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lzk;

    .line 5
    .line 6
    const/16 v1, 0x8

    .line 7
    .line 8
    invoke-direct {v0, v1, p0}, Lzk;-><init>(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lqq2;->p:Lzk;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    iput-object p1, p0, Lqq2;->n:Landroid/content/Context;

    .line 16
    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    new-instance p2, Lom1;

    .line 20
    .line 21
    new-instance v0, Landroid/content/ComponentName;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-direct {v0, p1, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 28
    .line 29
    .line 30
    const/16 p1, 0xa

    .line 31
    .line 32
    invoke-direct {p2, p1, v0}, Lom1;-><init>(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput-object p2, p0, Lqq2;->o:Lom1;

    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    iput-object p2, p0, Lqq2;->o:Lom1;

    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    const-string p0, "context must not be null"

    .line 42
    .line 43
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x0

    .line 47
    throw p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Lpq2;)Lnq2;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    const-string p0, "initialMemberRouteId cannot be null."

    .line 6
    .line 7
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public b(Ljava/lang/String;)Loq2;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    const-string p0, "routeId cannot be null"

    .line 6
    .line 7
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public c(Ljava/lang/String;Lpq2;)Loq2;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lqq2;->b(Ljava/lang/String;)Loq2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)Loq2;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    sget-object p2, Lpq2;->b:Lpq2;

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Lqq2;->c(Ljava/lang/String;Lpq2;)Loq2;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_0
    const-string p0, "routeGroupId cannot be null"

    .line 14
    .line 15
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_1
    const-string p0, "routeId cannot be null"

    .line 20
    .line 21
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public abstract e(Lup2;)V
.end method

.method public final f(Lxk0;)V
    .locals 1

    .line 1
    invoke-static {}, Lyq2;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lqq2;->t:Lxk0;

    .line 5
    .line 6
    if-eq v0, p1, :cond_0

    .line 7
    .line 8
    iput-object p1, p0, Lqq2;->t:Lxk0;

    .line 9
    .line 10
    iget-boolean p1, p0, Lqq2;->u:Z

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Lqq2;->u:Z

    .line 16
    .line 17
    iget-object p0, p0, Lqq2;->p:Lzk;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final g(Lup2;)V
    .locals 1

    .line 1
    invoke-static {}, Lyq2;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lqq2;->r:Lup2;

    .line 5
    .line 6
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iput-object p1, p0, Lqq2;->r:Lup2;

    .line 14
    .line 15
    iget-boolean p1, p0, Lqq2;->s:Z

    .line 16
    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    iput-boolean p1, p0, Lqq2;->s:Z

    .line 21
    .line 22
    iget-object p0, p0, Lqq2;->p:Lzk;

    .line 23
    .line 24
    const/4 p1, 0x2

    .line 25
    invoke-virtual {p0, p1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 26
    .line 27
    .line 28
    :cond_1
    :goto_0
    return-void
.end method
