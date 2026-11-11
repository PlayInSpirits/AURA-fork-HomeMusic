.class public final Lhy;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Lbv3;

.field public final b:Lev3;


# direct methods
.method public constructor <init>(Lbv3;Lfz0;Lev3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhy;->a:Lbv3;

    .line 5
    .line 6
    iput-object p3, p0, Lhy;->b:Lev3;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lcv3;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lze5;->a:Ltl1;

    .line 5
    .line 6
    iget-object p0, p0, Lhy;->a:Lbv3;

    .line 7
    .line 8
    iget-object v0, p0, Lbv3;->u:Lcv3;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iput-object p1, p0, Lbv3;->u:Lcv3;

    .line 13
    .line 14
    iget-object p1, p1, Lcv3;->s:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance v0, Lzu3;

    .line 17
    .line 18
    iget-object v1, p0, Lbv3;->s:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-direct {v0, p0, v1}, Lzu3;-><init>(Lbv3;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    const-string p0, "Check failed."

    .line 28
    .line 29
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final b(Lx90;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lhy;->a:Lbv3;

    .line 2
    .line 3
    iget-object p0, p0, Lbv3;->C:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final c()Lcv3;
    .locals 0

    .line 1
    iget-object p0, p0, Lhy;->a:Lbv3;

    .line 2
    .line 3
    iget-object p0, p0, Lbv3;->u:Lcv3;

    .line 4
    .line 5
    return-object p0
.end method

.method public final d(Lo34;Ljava/io/IOException;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p1, Lo34;->c:Ljava/net/InetSocketAddress;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final e(Lcv3;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final f(Lcv3;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final g(Lcv3;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final h(Lcv3;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final i(Lcv3;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final j(Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final k(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final l()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lhy;->b:Lev3;

    .line 2
    .line 3
    iget-object p0, p0, Lev3;->e:Loz3;

    .line 4
    .line 5
    iget-object p0, p0, Loz3;->b:Ljava/lang/String;

    .line 6
    .line 7
    const-string v0, "GET"

    .line 8
    .line 9
    invoke-static {p0, v0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    xor-int/lit8 p0, p0, 0x1

    .line 14
    .line 15
    return p0
.end method

.method public final m()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lhy;->a:Lbv3;

    .line 2
    .line 3
    iget-boolean p0, p0, Lbv3;->A:Z

    .line 4
    .line 5
    return p0
.end method

.method public final n(Lcv3;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final o()Ljava/net/Socket;
    .locals 0

    .line 1
    iget-object p0, p0, Lhy;->a:Lbv3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lbv3;->h()Ljava/net/Socket;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final p(Lx90;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lhy;->a:Lbv3;

    .line 2
    .line 3
    iget-object p0, p0, Lbv3;->C:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final q()V
    .locals 0

    .line 1
    return-void
.end method

.method public final r()V
    .locals 0

    .line 1
    return-void
.end method
