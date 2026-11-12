.class public final Lb04;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lta0;


# instance fields
.field public final a:Lmf4;

.field public final synthetic b:Lc04;


# direct methods
.method public constructor <init>(Lc04;Lmf4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb04;->b:Lc04;

    .line 5
    .line 6
    iput-object p2, p0, Lb04;->a:Lmf4;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 5

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    iget-object p1, p0, Lb04;->b:Lc04;

    .line 4
    .line 5
    monitor-enter p1

    .line 6
    :try_start_0
    iget-object p0, p0, Lb04;->a:Lmf4;

    .line 7
    .line 8
    iget-object v0, p0, Lmf4;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/util/Set;

    .line 11
    .line 12
    invoke-static {v0}, Le35;->B(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    :cond_0
    :goto_0
    if-ge v2, v1, :cond_2

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    check-cast v3, Lpz3;

    .line 30
    .line 31
    invoke-interface {v3}, Lpz3;->d()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-nez v4, :cond_0

    .line 36
    .line 37
    invoke-interface {v3}, Lpz3;->j()Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-nez v4, :cond_0

    .line 42
    .line 43
    invoke-interface {v3}, Lpz3;->clear()V

    .line 44
    .line 45
    .line 46
    iget-boolean v4, p0, Lmf4;->o:Z

    .line 47
    .line 48
    if-nez v4, :cond_1

    .line 49
    .line 50
    invoke-interface {v3}, Lpz3;->k()V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    iget-object v4, p0, Lmf4;->q:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v4, Ljava/util/HashSet;

    .line 57
    .line 58
    invoke-virtual {v4, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    monitor-exit p1

    .line 63
    return-void

    .line 64
    :catchall_0
    move-exception p0

    .line 65
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    throw p0

    .line 67
    :cond_3
    return-void
.end method
