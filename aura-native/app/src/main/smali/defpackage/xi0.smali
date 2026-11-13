.class public final Ldefpackage/xi0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/th0;
.implements Ljava/lang/Runnable;
.implements Ljava/lang/Comparable;
.implements Ldefpackage/r51;


# instance fields
.field public A:Ldefpackage/xq0;

.field public B:Ldefpackage/db3;

.field public C:Ldefpackage/m11;

.field public D:I

.field public E:J

.field public F:Z

.field public G:Ljava/lang/Object;

.field public H:Ljava/lang/Thread;

.field public I:Ldefpackage/f42;

.field public J:Ldefpackage/f42;

.field public K:Ljava/lang/Object;

.field public L:Ldefpackage/sh0;

.field public volatile M:Ldefpackage/uh0;

.field public volatile N:Z

.field public volatile O:Z

.field public P:Z

.field public Q:I

.field public R:I

.field public S:I

.field public final n:Ldefpackage/wi0;

.field public final o:Ljava/util/ArrayList;

.field public final p:Ldefpackage/ul4;

.field public final q:Ldefpackage/sd0;

.field public final r:Ldefpackage/io3;

.field public final s:Ldefpackage/jv3;

.field public final t:Ldefpackage/yl;

.field public u:Ldefpackage/ii1;

.field public v:Ldefpackage/f42;

.field public w:Ldefpackage/eq3;

.field public x:Ldefpackage/n11;

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Ldefpackage/sd0;Ldefpackage/i61;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldefpackage/wi0;

    .line 5
    .line 6
    invoke-direct {v0}, Ldefpackage/wi0;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ldefpackage/xi0;->n:Ldefpackage/wi0;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Ldefpackage/xi0;->o:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Ldefpackage/ul4;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Ldefpackage/xi0;->p:Ldefpackage/ul4;

    .line 24
    .line 25
    new-instance v0, Ldefpackage/jv3;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Ldefpackage/xi0;->s:Ldefpackage/jv3;

    .line 31
    .line 32
    new-instance v0, Ldefpackage/yl;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Ldefpackage/xi0;->t:Ldefpackage/yl;

    .line 38
    .line 39
    iput-object p1, p0, Ldefpackage/xi0;->q:Ldefpackage/sd0;

    .line 40
    .line 41
    iput-object p2, p0, Ldefpackage/xi0;->r:Ldefpackage/io3;

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final a(Ldefpackage/f42;Ljava/lang/Object;Ldefpackage/sh0;ILdefpackage/f42;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldefpackage/xi0;->I:Ldefpackage/f42;

    .line 2
    .line 3
    iput-object p2, p0, Ldefpackage/xi0;->K:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Ldefpackage/xi0;->L:Ldefpackage/sh0;

    .line 6
    .line 7
    iput p4, p0, Ldefpackage/xi0;->S:I

    .line 8
    .line 9
    iput-object p5, p0, Ldefpackage/xi0;->J:Ldefpackage/f42;

    .line 10
    .line 11
    iget-object p2, p0, Ldefpackage/xi0;->n:Ldefpackage/wi0;

    .line 12
    .line 13
    invoke-virtual {p2}, Ldefpackage/wi0;->a()Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    const/4 p3, 0x0

    .line 18
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    if-eq p1, p2, :cond_0

    .line 23
    .line 24
    const/4 p3, 0x1

    .line 25
    :cond_0
    iput-boolean p3, p0, Ldefpackage/xi0;->P:Z

    .line 26
    .line 27
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object p2, p0, Ldefpackage/xi0;->H:Ljava/lang/Thread;

    .line 32
    .line 33
    if-eq p1, p2, :cond_2

    .line 34
    .line 35
    const/4 p1, 0x3

    .line 36
    iput p1, p0, Ldefpackage/xi0;->R:I

    .line 37
    .line 38
    iget-object p1, p0, Ldefpackage/xi0;->C:Ldefpackage/m11;

    .line 39
    .line 40
    iget-boolean p2, p1, Ldefpackage/m11;->z:Z

    .line 41
    .line 42
    if-eqz p2, :cond_1

    .line 43
    .line 44
    iget-object p1, p1, Ldefpackage/m11;->v:Ldefpackage/li1;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iget-object p1, p1, Ldefpackage/m11;->u:Ldefpackage/li1;

    .line 48
    .line 49
    :goto_0
    invoke-virtual {p1, p0}, Ldefpackage/li1;->execute(Ljava/lang/Runnable;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    invoke-virtual {p0}, Ldefpackage/xi0;->f()V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final b(Ldefpackage/f42;Ljava/lang/Exception;Ldefpackage/sh0;I)V
    .locals 2

    .line 1
    invoke-interface {p3}, Ldefpackage/sh0;->c()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/bumptech/glide/load/engine/GlideException;

    .line 5
    .line 6
    const-string v1, "Fetching data failed"

    .line 7
    .line 8
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    invoke-direct {v0, v1, p2}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p3}, Ldefpackage/sh0;->a()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    iput-object p1, v0, Lcom/bumptech/glide/load/engine/GlideException;->o:Ldefpackage/f42;

    .line 20
    .line 21
    iput p4, v0, Lcom/bumptech/glide/load/engine/GlideException;->p:I

    .line 22
    .line 23
    iput-object p2, v0, Lcom/bumptech/glide/load/engine/GlideException;->q:Ljava/lang/Class;

    .line 24
    .line 25
    iget-object p1, p0, Ldefpackage/xi0;->o:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object p2, p0, Ldefpackage/xi0;->H:Ljava/lang/Thread;

    .line 35
    .line 36
    if-eq p1, p2, :cond_1

    .line 37
    .line 38
    const/4 p1, 0x2

    .line 39
    iput p1, p0, Ldefpackage/xi0;->R:I

    .line 40
    .line 41
    iget-object p1, p0, Ldefpackage/xi0;->C:Ldefpackage/m11;

    .line 42
    .line 43
    iget-boolean p2, p1, Ldefpackage/m11;->z:Z

    .line 44
    .line 45
    if-eqz p2, :cond_0

    .line 46
    .line 47
    iget-object p1, p1, Ldefpackage/m11;->v:Ldefpackage/li1;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    iget-object p1, p1, Ldefpackage/m11;->u:Ldefpackage/li1;

    .line 51
    .line 52
    :goto_0
    invoke-virtual {p1, p0}, Ldefpackage/li1;->execute(Ljava/lang/Runnable;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    invoke-virtual {p0}, Ldefpackage/xi0;->l()V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final c()Ldefpackage/ul4;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/xi0;->p:Ldefpackage/ul4;

    .line 2
    .line 3
    return-object p0
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 1
    check-cast p1, Ldefpackage/xi0;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/xi0;->w:Ldefpackage/eq3;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p1, Ldefpackage/xi0;->w:Ldefpackage/eq3;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    sub-int/2addr v0, v1

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    iget p0, p0, Ldefpackage/xi0;->D:I

    .line 19
    .line 20
    iget p1, p1, Ldefpackage/xi0;->D:I

    .line 21
    .line 22
    sub-int/2addr p0, p1

    .line 23
    return p0

    .line 24
    :cond_0
    return v0
.end method

.method public final d(Ldefpackage/sh0;Ljava/lang/Object;I)Ldefpackage/q04;
    .locals 5

    .line 1
    const-string v0, "Decoded result "

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    invoke-interface {p1}, Ldefpackage/sh0;->c()V

    .line 7
    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    :try_start_0
    sget v2, Ldefpackage/ee2;->b:I

    .line 11
    .line 12
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    invoke-virtual {p0, p3, p2}, Ldefpackage/xi0;->e(ILjava/lang/Object;)Ldefpackage/q04;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    const-string p3, "DecodeJob"

    .line 21
    .line 22
    const/4 v4, 0x2

    .line 23
    invoke-static {p3, v4}, Landroid/util/Ldefpackage/og;->isLoggable(Ljava/lang/String;I)Z

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    if-eqz p3, :cond_1

    .line 28
    .line 29
    new-instance p3, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    invoke-virtual {p0, p3, v2, v3, v1}, Ldefpackage/xi0;->i(Ljava/lang/String;JLjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p0

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    :goto_0
    invoke-interface {p1}, Ldefpackage/sh0;->c()V

    .line 48
    .line 49
    .line 50
    return-object p2

    .line 51
    :goto_1
    invoke-interface {p1}, Ldefpackage/sh0;->c()V

    .line 52
    .line 53
    .line 54
    throw p0
.end method

.method public final e(ILjava/lang/Object;)Ldefpackage/q04;
    .locals 8

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Ldefpackage/xi0;->n:Ldefpackage/wi0;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ldefpackage/wi0;->c(Ljava/lang/Class;)Ldefpackage/fd2;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v0, p0, Ldefpackage/xi0;->B:Ldefpackage/db3;

    .line 12
    .line 13
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 14
    .line 15
    const/16 v4, 0x1a

    .line 16
    .line 17
    if-ge v3, v4, :cond_1

    .line 18
    .line 19
    :cond_0
    :goto_0
    move-object v7, v0

    .line 20
    goto :goto_3

    .line 21
    :cond_1
    const/4 v3, 0x4

    .line 22
    if-eq p1, v3, :cond_3

    .line 23
    .line 24
    iget-boolean v1, v1, Ldefpackage/wi0;->r:Z

    .line 25
    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_2
    const/4 v1, 0x0

    .line 30
    goto :goto_2

    .line 31
    :cond_3
    :goto_1
    const/4 v1, 0x1

    .line 32
    :goto_2
    sget-object v3, Ldefpackage/iu0;->i:Ldefpackage/ab3;

    .line 33
    .line 34
    invoke-virtual {v0, v3}, Ldefpackage/db3;->c(Ldefpackage/ab3;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    check-cast v4, Ljava/lang/Boolean;

    .line 39
    .line 40
    if-eqz v4, :cond_4

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_0

    .line 47
    .line 48
    if-eqz v1, :cond_4

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_4
    new-instance v0, Ldefpackage/db3;

    .line 52
    .line 53
    invoke-direct {v0}, Ldefpackage/db3;-><init>()V

    .line 54
    .line 55
    .line 56
    iget-object v4, p0, Ldefpackage/xi0;->B:Ldefpackage/db3;

    .line 57
    .line 58
    iget-object v4, v4, Ldefpackage/db3;->b:Ldefpackage/yx;

    .line 59
    .line 60
    iget-object v5, v0, Ldefpackage/db3;->b:Ldefpackage/yx;

    .line 61
    .line 62
    invoke-virtual {v5, v4}, Ldefpackage/yx;->g(Ldefpackage/oi;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v5, v3, v1}, Ldefpackage/yx;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :goto_3
    iget-object v0, p0, Ldefpackage/xi0;->u:Ldefpackage/ii1;

    .line 74
    .line 75
    invoke-virtual {v0}, Ldefpackage/ii1;->a()Ldefpackage/ey3;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0, p2}, Ldefpackage/ey3;->g(Ljava/lang/Object;)Ldefpackage/yh0;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    :try_start_0
    iget v3, p0, Ldefpackage/xi0;->y:I

    .line 84
    .line 85
    iget v4, p0, Ldefpackage/xi0;->z:I

    .line 86
    .line 87
    new-instance v5, Ldefpackage/x7;

    .line 88
    .line 89
    const/4 p2, 0x5

    .line 90
    invoke-direct {v5, p1, p2, p0}, Ldefpackage/x7;-><init>(IILjava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v2 .. v7}, Ldefpackage/fd2;->a(IILdefpackage/x7;Ldefpackage/yh0;Ldefpackage/db3;)Ldefpackage/q04;

    .line 94
    .line 95
    .line 96
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    invoke-interface {v6}, Ldefpackage/yh0;->c()V

    .line 98
    .line 99
    .line 100
    return-object p0

    .line 101
    :catchall_0
    move-exception v0

    .line 102
    move-object p0, v0

    .line 103
    invoke-interface {v6}, Ldefpackage/yh0;->c()V

    .line 104
    .line 105
    .line 106
    throw p0
.end method

.method public final f()V
    .locals 13

    .line 1
    const-string v0, "DecodeJob"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v0, v1}, Landroid/util/Ldefpackage/og;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v0, "Retrieved data"

    .line 11
    .line 12
    iget-wide v2, p0, Ldefpackage/xi0;->E:J

    .line 13
    .line 14
    new-instance v4, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v5, "data: "

    .line 17
    .line 18
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v5, p0, Ldefpackage/xi0;->K:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v5, ", cache key: "

    .line 27
    .line 28
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v5, p0, Ldefpackage/xi0;->I:Ldefpackage/f42;

    .line 32
    .line 33
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v5, ", fetcher: "

    .line 37
    .line 38
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v5, p0, Ldefpackage/xi0;->L:Ldefpackage/sh0;

    .line 42
    .line 43
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {p0, v0, v2, v3, v4}, Ldefpackage/xi0;->i(Ljava/lang/String;JLjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    const/4 v2, 0x0

    .line 54
    :try_start_0
    iget-object v0, p0, Ldefpackage/xi0;->L:Ldefpackage/sh0;

    .line 55
    .line 56
    iget-object v3, p0, Ldefpackage/xi0;->K:Ljava/lang/Object;

    .line 57
    .line 58
    iget v4, p0, Ldefpackage/xi0;->S:I

    .line 59
    .line 60
    invoke-virtual {p0, v0, v3, v4}, Ldefpackage/xi0;->d(Ldefpackage/sh0;Ljava/lang/Object;I)Ldefpackage/q04;

    .line 61
    .line 62
    .line 63
    move-result-object v0
    :try_end_0
    .catch Lcom/bumptech/glide/load/engine/GlideException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    goto :goto_0

    .line 65
    :catch_0
    move-exception v0

    .line 66
    iget-object v3, p0, Ldefpackage/xi0;->J:Ldefpackage/f42;

    .line 67
    .line 68
    iget v4, p0, Ldefpackage/xi0;->S:I

    .line 69
    .line 70
    iput-object v3, v0, Lcom/bumptech/glide/load/engine/GlideException;->o:Ldefpackage/f42;

    .line 71
    .line 72
    iput v4, v0, Lcom/bumptech/glide/load/engine/GlideException;->p:I

    .line 73
    .line 74
    iput-object v2, v0, Lcom/bumptech/glide/load/engine/GlideException;->q:Ljava/lang/Class;

    .line 75
    .line 76
    iget-object v3, p0, Ldefpackage/xi0;->o:Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-object v0, v2

    .line 82
    :goto_0
    if-eqz v0, :cond_b

    .line 83
    .line 84
    iget v3, p0, Ldefpackage/xi0;->S:I

    .line 85
    .line 86
    instance-of v4, v0, Ldefpackage/xy1;

    .line 87
    .line 88
    if-eqz v4, :cond_1

    .line 89
    .line 90
    move-object v4, v0

    .line 91
    check-cast v4, Ldefpackage/xy1;

    .line 92
    .line 93
    invoke-interface {v4}, Ldefpackage/xy1;->a()V

    .line 94
    .line 95
    .line 96
    :cond_1
    iget-object v4, p0, Ldefpackage/xi0;->s:Ldefpackage/jv3;

    .line 97
    .line 98
    iget-object v4, v4, Ldefpackage/jv3;->p:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v4, Ldefpackage/de2;

    .line 101
    .line 102
    const/4 v5, 0x0

    .line 103
    const/4 v6, 0x1

    .line 104
    if-eqz v4, :cond_2

    .line 105
    .line 106
    sget-object v2, Ldefpackage/de2;->r:Ldefpackage/i61;

    .line 107
    .line 108
    invoke-virtual {v2}, Ldefpackage/i61;->b()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    check-cast v2, Ldefpackage/de2;

    .line 113
    .line 114
    iput-boolean v5, v2, Ldefpackage/de2;->q:Z

    .line 115
    .line 116
    iput-boolean v6, v2, Ldefpackage/de2;->p:Z

    .line 117
    .line 118
    iput-object v0, v2, Ldefpackage/de2;->o:Ldefpackage/q04;

    .line 119
    .line 120
    move-object v0, v2

    .line 121
    :cond_2
    invoke-virtual {p0}, Ldefpackage/xi0;->n()V

    .line 122
    .line 123
    .line 124
    iget-object v4, p0, Ldefpackage/xi0;->C:Ldefpackage/m11;

    .line 125
    .line 126
    monitor-enter v4

    .line 127
    :try_start_1
    iput-object v0, v4, Ldefpackage/m11;->B:Ldefpackage/q04;

    .line 128
    .line 129
    iput v3, v4, Ldefpackage/m11;->C:I

    .line 130
    .line 131
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 132
    monitor-enter v4

    .line 133
    :try_start_2
    iget-object v0, v4, Ldefpackage/m11;->o:Ldefpackage/ul4;

    .line 134
    .line 135
    invoke-virtual {v0}, Ldefpackage/ul4;->a()V

    .line 136
    .line 137
    .line 138
    iget-boolean v0, v4, Ldefpackage/m11;->I:Z

    .line 139
    .line 140
    if-eqz v0, :cond_3

    .line 141
    .line 142
    iget-object v0, v4, Ldefpackage/m11;->B:Ldefpackage/q04;

    .line 143
    .line 144
    invoke-interface {v0}, Ldefpackage/q04;->b()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v4}, Ldefpackage/m11;->f()V

    .line 148
    .line 149
    .line 150
    monitor-exit v4

    .line 151
    goto :goto_2

    .line 152
    :catchall_0
    move-exception v0

    .line 153
    move-object p0, v0

    .line 154
    goto/16 :goto_5

    .line 155
    .line 156
    :cond_3
    iget-object v0, v4, Ldefpackage/m11;->n:Ldefpackage/l11;

    .line 157
    .line 158
    iget-object v0, v0, Ldefpackage/l11;->n:Ljava/util/ArrayList;

    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-nez v0, :cond_a

    .line 165
    .line 166
    iget-boolean v0, v4, Ldefpackage/m11;->D:Z

    .line 167
    .line 168
    if-nez v0, :cond_9

    .line 169
    .line 170
    iget-object v0, v4, Ldefpackage/m11;->r:Ldefpackage/om0;

    .line 171
    .line 172
    iget-object v8, v4, Ldefpackage/m11;->B:Ldefpackage/q04;

    .line 173
    .line 174
    iget-boolean v9, v4, Ldefpackage/m11;->y:Z

    .line 175
    .line 176
    iget-object v11, v4, Ldefpackage/m11;->x:Ldefpackage/n11;

    .line 177
    .line 178
    iget-object v12, v4, Ldefpackage/m11;->p:Ldefpackage/i11;

    .line 179
    .line 180
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    new-instance v7, Ldefpackage/o11;

    .line 184
    .line 185
    const/4 v10, 0x1

    .line 186
    invoke-direct/range {v7 .. v12}, Ldefpackage/o11;-><init>(Ldefpackage/q04;ZZLdefpackage/f42;Ldefpackage/i11;)V

    .line 187
    .line 188
    .line 189
    iput-object v7, v4, Ldefpackage/m11;->G:Ldefpackage/o11;

    .line 190
    .line 191
    iput-boolean v6, v4, Ldefpackage/m11;->D:Z

    .line 192
    .line 193
    iget-object v0, v4, Ldefpackage/m11;->n:Ldefpackage/l11;

    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    new-instance v3, Ljava/util/ArrayList;

    .line 199
    .line 200
    iget-object v0, v0, Ldefpackage/l11;->n:Ljava/util/ArrayList;

    .line 201
    .line 202
    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    add-int/2addr v0, v6

    .line 210
    invoke-virtual {v4, v0}, Ldefpackage/m11;->d(I)V

    .line 211
    .line 212
    .line 213
    iget-object v0, v4, Ldefpackage/m11;->x:Ldefpackage/n11;

    .line 214
    .line 215
    iget-object v7, v4, Ldefpackage/m11;->G:Ldefpackage/o11;

    .line 216
    .line 217
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 218
    iget-object v8, v4, Ldefpackage/m11;->s:Ldefpackage/i11;

    .line 219
    .line 220
    invoke-virtual {v8, v4, v0, v7}, Ldefpackage/i11;->d(Ldefpackage/m11;Ldefpackage/n11;Ldefpackage/o11;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    move v7, v5

    .line 228
    :goto_1
    if-ge v7, v0, :cond_4

    .line 229
    .line 230
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v8

    .line 234
    add-int/lit8 v7, v7, 0x1

    .line 235
    .line 236
    check-cast v8, Ldefpackage/k11;

    .line 237
    .line 238
    iget-object v9, v8, Ldefpackage/k11;->b:Ljava/util/concurrent/Executor;

    .line 239
    .line 240
    new-instance v10, Ldefpackage/j11;

    .line 241
    .line 242
    iget-object v8, v8, Ldefpackage/k11;->a:Ldefpackage/cf4;

    .line 243
    .line 244
    invoke-direct {v10, v4, v8, v6}, Ldefpackage/j11;-><init>(Ldefpackage/m11;Ldefpackage/cf4;I)V

    .line 245
    .line 246
    .line 247
    invoke-interface {v9, v10}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 248
    .line 249
    .line 250
    goto :goto_1

    .line 251
    :cond_4
    invoke-virtual {v4}, Ldefpackage/m11;->b()V

    .line 252
    .line 253
    .line 254
    :goto_2
    const/4 v0, 0x5

    .line 255
    iput v0, p0, Ldefpackage/xi0;->Q:I

    .line 256
    .line 257
    :try_start_3
    iget-object v3, p0, Ldefpackage/xi0;->s:Ldefpackage/jv3;

    .line 258
    .line 259
    iget-object v0, v3, Ldefpackage/jv3;->p:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v0, Ldefpackage/de2;

    .line 262
    .line 263
    if-eqz v0, :cond_5

    .line 264
    .line 265
    move v5, v6

    .line 266
    :cond_5
    if-eqz v5, :cond_6

    .line 267
    .line 268
    iget-object v0, p0, Ldefpackage/xi0;->q:Ldefpackage/sd0;

    .line 269
    .line 270
    iget-object v4, p0, Ldefpackage/xi0;->B:Ldefpackage/db3;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 271
    .line 272
    :try_start_4
    invoke-virtual {v0}, Ldefpackage/sd0;->a()Ldefpackage/wq0;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    iget-object v5, v3, Ldefpackage/jv3;->n:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v5, Ldefpackage/f42;

    .line 279
    .line 280
    new-instance v7, Ldefpackage/ns3;

    .line 281
    .line 282
    iget-object v8, v3, Ldefpackage/jv3;->o:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v8, Ldefpackage/w04;

    .line 285
    .line 286
    iget-object v9, v3, Ldefpackage/jv3;->p:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v9, Ldefpackage/de2;

    .line 289
    .line 290
    invoke-direct {v7, v8, v9, v4, v1}, Ldefpackage/ns3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 291
    .line 292
    .line 293
    invoke-interface {v0, v5, v7}, Ldefpackage/wq0;->M(Ldefpackage/f42;Ldefpackage/ns3;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 294
    .line 295
    .line 296
    :try_start_5
    iget-object v0, v3, Ldefpackage/jv3;->p:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v0, Ldefpackage/de2;

    .line 299
    .line 300
    invoke-virtual {v0}, Ldefpackage/de2;->a()V

    .line 301
    .line 302
    .line 303
    goto :goto_3

    .line 304
    :catchall_1
    move-exception v0

    .line 305
    move-object p0, v0

    .line 306
    iget-object v0, v3, Ldefpackage/jv3;->p:Ljava/lang/Object;

    .line 307
    .line 308
    check-cast v0, Ldefpackage/de2;

    .line 309
    .line 310
    invoke-virtual {v0}, Ldefpackage/de2;->a()V

    .line 311
    .line 312
    .line 313
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 314
    :catchall_2
    move-exception v0

    .line 315
    move-object p0, v0

    .line 316
    goto :goto_4

    .line 317
    :cond_6
    :goto_3
    if-eqz v2, :cond_7

    .line 318
    .line 319
    invoke-virtual {v2}, Ldefpackage/de2;->a()V

    .line 320
    .line 321
    .line 322
    :cond_7
    iget-object v1, p0, Ldefpackage/xi0;->t:Ldefpackage/yl;

    .line 323
    .line 324
    monitor-enter v1

    .line 325
    :try_start_6
    iput-boolean v6, v1, Ldefpackage/yl;->b:Z

    .line 326
    .line 327
    invoke-virtual {v1}, Ldefpackage/yl;->b()Z

    .line 328
    .line 329
    .line 330
    move-result v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 331
    monitor-exit v1

    .line 332
    if-eqz v0, :cond_c

    .line 333
    .line 334
    invoke-virtual {p0}, Ldefpackage/xi0;->k()V

    .line 335
    .line 336
    .line 337
    goto :goto_6

    .line 338
    :catchall_3
    move-exception v0

    .line 339
    move-object p0, v0

    .line 340
    :try_start_7
    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 341
    throw p0

    .line 342
    :goto_4
    if-eqz v2, :cond_8

    .line 343
    .line 344
    invoke-virtual {v2}, Ldefpackage/de2;->a()V

    .line 345
    .line 346
    .line 347
    :cond_8
    throw p0

    .line 348
    :cond_9
    :try_start_8
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 349
    .line 350
    const-string v0, "Already have resource"

    .line 351
    .line 352
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    throw p0

    .line 356
    :cond_a
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 357
    .line 358
    const-string v0, "Received a resource without any callbacks to notify"

    .line 359
    .line 360
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    throw p0

    .line 364
    :goto_5
    monitor-exit v4
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 365
    throw p0

    .line 366
    :catchall_4
    move-exception v0

    .line 367
    move-object p0, v0

    .line 368
    :try_start_9
    monitor-exit v4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 369
    throw p0

    .line 370
    :cond_b
    invoke-virtual {p0}, Ldefpackage/xi0;->l()V

    .line 371
    .line 372
    .line 373
    :cond_c
    :goto_6
    return-void
.end method

.method public final g()Ldefpackage/uh0;
    .locals 3

    .line 1
    iget v0, p0, Ldefpackage/xi0;->Q:I

    .line 2
    .line 3
    invoke-static {v0}, Ldefpackage/xa3;->w(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    iget-object v2, p0, Ldefpackage/xi0;->n:Ldefpackage/wi0;

    .line 9
    .line 10
    if-eq v0, v1, :cond_3

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq v0, v1, :cond_2

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    const/4 v1, 0x5

    .line 19
    const/4 v2, 0x0

    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    return-object v2

    .line 23
    :cond_0
    iget p0, p0, Ldefpackage/xi0;->Q:I

    .line 24
    .line 25
    invoke-static {p0}, Ldefpackage/xa3;->y(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string v0, "Unrecognized stage: "

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object v2

    .line 39
    :cond_1
    new-instance v0, Ldefpackage/fj4;

    .line 40
    .line 41
    invoke-direct {v0, v2, p0}, Ldefpackage/fj4;-><init>(Ldefpackage/wi0;Ldefpackage/xi0;)V

    .line 42
    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_2
    new-instance v0, Ldefpackage/ph0;

    .line 46
    .line 47
    invoke-virtual {v2}, Ldefpackage/wi0;->a()Ljava/util/ArrayList;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-direct {v0, v1, v2, p0}, Ldefpackage/ph0;-><init>(Ljava/util/List;Ldefpackage/wi0;Ldefpackage/th0;)V

    .line 52
    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_3
    new-instance v0, Ldefpackage/r04;

    .line 56
    .line 57
    invoke-direct {v0, v2, p0}, Ldefpackage/r04;-><init>(Ldefpackage/wi0;Ldefpackage/xi0;)V

    .line 58
    .line 59
    .line 60
    return-object v0
.end method

.method public final h(I)I
    .locals 5

    .line 1
    invoke-static {p1}, Ldefpackage/xa3;->w(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v3, 0x2

    .line 8
    if-eqz v0, :cond_6

    .line 9
    .line 10
    const/4 v4, 0x3

    .line 11
    if-eq v0, v2, :cond_4

    .line 12
    .line 13
    if-eq v0, v3, :cond_1

    .line 14
    .line 15
    if-eq v0, v4, :cond_2

    .line 16
    .line 17
    const/4 p0, 0x5

    .line 18
    if-ne v0, p0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {p1}, Ldefpackage/xa3;->y(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const-string p1, "Unrecognized stage: "

    .line 26
    .line 27
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return v1

    .line 35
    :cond_1
    iget-boolean p0, p0, Ldefpackage/xi0;->F:Z

    .line 36
    .line 37
    if-eqz p0, :cond_3

    .line 38
    .line 39
    :cond_2
    :goto_0
    const/4 p0, 0x6

    .line 40
    return p0

    .line 41
    :cond_3
    const/4 p0, 0x4

    .line 42
    return p0

    .line 43
    :cond_4
    iget-object p1, p0, Ldefpackage/xi0;->A:Ldefpackage/xq0;

    .line 44
    .line 45
    iget p1, p1, Ldefpackage/xq0;->a:I

    .line 46
    .line 47
    packed-switch p1, :pswitch_data_0

    .line 48
    .line 49
    .line 50
    :pswitch_0
    move v1, v2

    .line 51
    :pswitch_1
    if-eqz v1, :cond_5

    .line 52
    .line 53
    return v4

    .line 54
    :cond_5
    invoke-virtual {p0, v4}, Ldefpackage/xi0;->h(I)I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    return p0

    .line 59
    :cond_6
    iget-object p1, p0, Ldefpackage/xi0;->A:Ldefpackage/xq0;

    .line 60
    .line 61
    iget p1, p1, Ldefpackage/xq0;->a:I

    .line 62
    .line 63
    packed-switch p1, :pswitch_data_1

    .line 64
    .line 65
    .line 66
    :pswitch_2
    move v1, v2

    .line 67
    :pswitch_3
    if-eqz v1, :cond_7

    .line 68
    .line 69
    return v3

    .line 70
    :cond_7
    invoke-virtual {p0, v3}, Ldefpackage/xi0;->h(I)I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    return p0

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_2
        :pswitch_3
        :pswitch_3
    .end packed-switch
.end method

.method public final i(Ljava/lang/String;JLjava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, " in "

    .line 2
    .line 3
    invoke-static {p1, v0}, Ldefpackage/b11;->s(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p2, p3}, Ldefpackage/ee2;->a(J)D

    .line 8
    .line 9
    .line 10
    move-result-wide p2

    .line 11
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p2, ", load key: "

    .line 15
    .line 16
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Ldefpackage/xi0;->x:Ldefpackage/n11;

    .line 20
    .line 21
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    if-eqz p4, :cond_0

    .line 25
    .line 26
    const-string p0, ", "

    .line 27
    .line 28
    invoke-virtual {p0, p4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const-string p0, ""

    .line 34
    .line 35
    :goto_0
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string p0, ", thread: "

    .line 39
    .line 40
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    const-string p1, "DecodeJob"

    .line 59
    .line 60
    invoke-static {p1, p0}, Landroid/util/Ldefpackage/og;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final j()V
    .locals 9

    .line 1
    invoke-virtual {p0}, Ldefpackage/xi0;->n()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/bumptech/glide/load/engine/GlideException;

    .line 5
    .line 6
    const-string v1, "Failed to load resource"

    .line 7
    .line 8
    new-instance v2, Ljava/util/ArrayList;

    .line 9
    .line 10
    iget-object v3, p0, Ldefpackage/xi0;->o:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Ldefpackage/xi0;->C:Ldefpackage/m11;

    .line 19
    .line 20
    monitor-enter v1

    .line 21
    :try_start_0
    iput-object v0, v1, Ldefpackage/m11;->E:Lcom/bumptech/glide/load/engine/GlideException;

    .line 22
    .line 23
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 24
    monitor-enter v1

    .line 25
    :try_start_1
    iget-object v0, v1, Ldefpackage/m11;->o:Ldefpackage/ul4;

    .line 26
    .line 27
    invoke-virtual {v0}, Ldefpackage/ul4;->a()V

    .line 28
    .line 29
    .line 30
    iget-boolean v0, v1, Ldefpackage/m11;->I:Z

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    invoke-virtual {v1}, Ldefpackage/m11;->f()V

    .line 36
    .line 37
    .line 38
    monitor-exit v1

    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    goto :goto_2

    .line 42
    :cond_0
    iget-object v0, v1, Ldefpackage/m11;->n:Ldefpackage/l11;

    .line 43
    .line 44
    iget-object v0, v0, Ldefpackage/l11;->n:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_4

    .line 51
    .line 52
    iget-boolean v0, v1, Ldefpackage/m11;->F:Z

    .line 53
    .line 54
    if-nez v0, :cond_3

    .line 55
    .line 56
    iput-boolean v2, v1, Ldefpackage/m11;->F:Z

    .line 57
    .line 58
    iget-object v0, v1, Ldefpackage/m11;->x:Ldefpackage/n11;

    .line 59
    .line 60
    iget-object v3, v1, Ldefpackage/m11;->n:Ldefpackage/l11;

    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    new-instance v4, Ljava/util/ArrayList;

    .line 66
    .line 67
    iget-object v3, v3, Ldefpackage/l11;->n:Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    add-int/2addr v3, v2

    .line 77
    invoke-virtual {v1, v3}, Ldefpackage/m11;->d(I)V

    .line 78
    .line 79
    .line 80
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    iget-object v3, v1, Ldefpackage/m11;->s:Ldefpackage/i11;

    .line 82
    .line 83
    const/4 v5, 0x0

    .line 84
    invoke-virtual {v3, v1, v0, v5}, Ldefpackage/i11;->d(Ldefpackage/m11;Ldefpackage/n11;Ldefpackage/o11;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    const/4 v3, 0x0

    .line 92
    move v5, v3

    .line 93
    :goto_0
    if-ge v5, v0, :cond_1

    .line 94
    .line 95
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    add-int/lit8 v5, v5, 0x1

    .line 100
    .line 101
    check-cast v6, Ldefpackage/k11;

    .line 102
    .line 103
    iget-object v7, v6, Ldefpackage/k11;->b:Ljava/util/concurrent/Executor;

    .line 104
    .line 105
    new-instance v8, Ldefpackage/j11;

    .line 106
    .line 107
    iget-object v6, v6, Ldefpackage/k11;->a:Ldefpackage/cf4;

    .line 108
    .line 109
    invoke-direct {v8, v1, v6, v3}, Ldefpackage/j11;-><init>(Ldefpackage/m11;Ldefpackage/cf4;I)V

    .line 110
    .line 111
    .line 112
    invoke-interface {v7, v8}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_1
    invoke-virtual {v1}, Ldefpackage/m11;->b()V

    .line 117
    .line 118
    .line 119
    :goto_1
    iget-object v0, p0, Ldefpackage/xi0;->t:Ldefpackage/yl;

    .line 120
    .line 121
    monitor-enter v0

    .line 122
    :try_start_2
    iput-boolean v2, v0, Ldefpackage/yl;->c:Z

    .line 123
    .line 124
    invoke-virtual {v0}, Ldefpackage/yl;->b()Z

    .line 125
    .line 126
    .line 127
    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 128
    monitor-exit v0

    .line 129
    if-eqz v1, :cond_2

    .line 130
    .line 131
    invoke-virtual {p0}, Ldefpackage/xi0;->k()V

    .line 132
    .line 133
    .line 134
    :cond_2
    return-void

    .line 135
    :catchall_1
    move-exception p0

    .line 136
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 137
    throw p0

    .line 138
    :cond_3
    :try_start_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 139
    .line 140
    const-string v0, "Already failed once"

    .line 141
    .line 142
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw p0

    .line 146
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 147
    .line 148
    const-string v0, "Received an exception without any callbacks to notify"

    .line 149
    .line 150
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    throw p0

    .line 154
    :goto_2
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 155
    throw p0

    .line 156
    :catchall_2
    move-exception p0

    .line 157
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 158
    throw p0
.end method

.method public final k()V
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/xi0;->t:Ldefpackage/yl;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    iput-boolean v1, v0, Ldefpackage/yl;->b:Z

    .line 6
    .line 7
    iput-boolean v1, v0, Ldefpackage/yl;->a:Z

    .line 8
    .line 9
    iput-boolean v1, v0, Ldefpackage/yl;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    monitor-exit v0

    .line 12
    iget-object v0, p0, Ldefpackage/xi0;->s:Ldefpackage/jv3;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    iput-object v2, v0, Ldefpackage/jv3;->n:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object v2, v0, Ldefpackage/jv3;->o:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object v2, v0, Ldefpackage/jv3;->p:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v0, p0, Ldefpackage/xi0;->n:Ldefpackage/wi0;

    .line 22
    .line 23
    iput-object v2, v0, Ldefpackage/wi0;->c:Ldefpackage/ii1;

    .line 24
    .line 25
    iput-object v2, v0, Ldefpackage/wi0;->d:Ljava/lang/Object;

    .line 26
    .line 27
    iput-object v2, v0, Ldefpackage/wi0;->n:Ldefpackage/f42;

    .line 28
    .line 29
    iput-object v2, v0, Ldefpackage/wi0;->g:Ljava/lang/Class;

    .line 30
    .line 31
    iput-object v2, v0, Ldefpackage/wi0;->k:Ljava/lang/Class;

    .line 32
    .line 33
    iput-object v2, v0, Ldefpackage/wi0;->i:Ldefpackage/db3;

    .line 34
    .line 35
    iput-object v2, v0, Ldefpackage/wi0;->o:Ldefpackage/eq3;

    .line 36
    .line 37
    iput-object v2, v0, Ldefpackage/wi0;->j:Ljava/util/Map;

    .line 38
    .line 39
    iput-object v2, v0, Ldefpackage/wi0;->p:Ldefpackage/xq0;

    .line 40
    .line 41
    iget-object v3, v0, Ldefpackage/wi0;->a:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 44
    .line 45
    .line 46
    iput-boolean v1, v0, Ldefpackage/wi0;->l:Z

    .line 47
    .line 48
    iget-object v3, v0, Ldefpackage/wi0;->b:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 51
    .line 52
    .line 53
    iput-boolean v1, v0, Ldefpackage/wi0;->m:Z

    .line 54
    .line 55
    iput-boolean v1, p0, Ldefpackage/xi0;->N:Z

    .line 56
    .line 57
    iput-object v2, p0, Ldefpackage/xi0;->u:Ldefpackage/ii1;

    .line 58
    .line 59
    iput-object v2, p0, Ldefpackage/xi0;->v:Ldefpackage/f42;

    .line 60
    .line 61
    iput-object v2, p0, Ldefpackage/xi0;->B:Ldefpackage/db3;

    .line 62
    .line 63
    iput-object v2, p0, Ldefpackage/xi0;->w:Ldefpackage/eq3;

    .line 64
    .line 65
    iput-object v2, p0, Ldefpackage/xi0;->x:Ldefpackage/n11;

    .line 66
    .line 67
    iput-object v2, p0, Ldefpackage/xi0;->C:Ldefpackage/m11;

    .line 68
    .line 69
    iput v1, p0, Ldefpackage/xi0;->Q:I

    .line 70
    .line 71
    iput-object v2, p0, Ldefpackage/xi0;->M:Ldefpackage/uh0;

    .line 72
    .line 73
    iput-object v2, p0, Ldefpackage/xi0;->H:Ljava/lang/Thread;

    .line 74
    .line 75
    iput-object v2, p0, Ldefpackage/xi0;->I:Ldefpackage/f42;

    .line 76
    .line 77
    iput-object v2, p0, Ldefpackage/xi0;->K:Ljava/lang/Object;

    .line 78
    .line 79
    iput v1, p0, Ldefpackage/xi0;->S:I

    .line 80
    .line 81
    iput-object v2, p0, Ldefpackage/xi0;->L:Ldefpackage/sh0;

    .line 82
    .line 83
    const-wide/16 v3, 0x0

    .line 84
    .line 85
    iput-wide v3, p0, Ldefpackage/xi0;->E:J

    .line 86
    .line 87
    iput-boolean v1, p0, Ldefpackage/xi0;->O:Z

    .line 88
    .line 89
    iput-object v2, p0, Ldefpackage/xi0;->G:Ljava/lang/Object;

    .line 90
    .line 91
    iget-object v0, p0, Ldefpackage/xi0;->o:Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 94
    .line 95
    .line 96
    iget-object v0, p0, Ldefpackage/xi0;->r:Ldefpackage/io3;

    .line 97
    .line 98
    invoke-interface {v0, p0}, Ldefpackage/io3;->a(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :catchall_0
    move-exception p0

    .line 103
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 104
    throw p0
.end method

.method public final l()V
    .locals 3

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Ldefpackage/xi0;->H:Ljava/lang/Thread;

    .line 6
    .line 7
    sget v0, Ldefpackage/ee2;->b:I

    .line 8
    .line 9
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iput-wide v0, p0, Ldefpackage/xi0;->E:J

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    :cond_0
    iget-boolean v1, p0, Ldefpackage/xi0;->O:Z

    .line 17
    .line 18
    if-nez v1, :cond_2

    .line 19
    .line 20
    iget-object v1, p0, Ldefpackage/xi0;->M:Ldefpackage/uh0;

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    iget-object v0, p0, Ldefpackage/xi0;->M:Ldefpackage/uh0;

    .line 25
    .line 26
    invoke-interface {v0}, Ldefpackage/uh0;->c()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    iget v1, p0, Ldefpackage/xi0;->Q:I

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Ldefpackage/xi0;->h(I)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    iput v1, p0, Ldefpackage/xi0;->Q:I

    .line 39
    .line 40
    invoke-virtual {p0}, Ldefpackage/xi0;->g()Ldefpackage/uh0;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iput-object v1, p0, Ldefpackage/xi0;->M:Ldefpackage/uh0;

    .line 45
    .line 46
    iget v1, p0, Ldefpackage/xi0;->Q:I

    .line 47
    .line 48
    const/4 v2, 0x4

    .line 49
    if-ne v1, v2, :cond_0

    .line 50
    .line 51
    const/4 v0, 0x2

    .line 52
    iput v0, p0, Ldefpackage/xi0;->R:I

    .line 53
    .line 54
    iget-object v0, p0, Ldefpackage/xi0;->C:Ldefpackage/m11;

    .line 55
    .line 56
    iget-boolean v1, v0, Ldefpackage/m11;->z:Z

    .line 57
    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    iget-object v0, v0, Ldefpackage/m11;->v:Ldefpackage/li1;

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    iget-object v0, v0, Ldefpackage/m11;->u:Ldefpackage/li1;

    .line 64
    .line 65
    :goto_0
    invoke-virtual {v0, p0}, Ldefpackage/li1;->execute(Ljava/lang/Runnable;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_2
    iget v1, p0, Ldefpackage/xi0;->Q:I

    .line 70
    .line 71
    const/4 v2, 0x6

    .line 72
    if-eq v1, v2, :cond_3

    .line 73
    .line 74
    iget-boolean v1, p0, Ldefpackage/xi0;->O:Z

    .line 75
    .line 76
    if-eqz v1, :cond_4

    .line 77
    .line 78
    :cond_3
    if-nez v0, :cond_4

    .line 79
    .line 80
    invoke-virtual {p0}, Ldefpackage/xi0;->j()V

    .line 81
    .line 82
    .line 83
    :cond_4
    return-void
.end method

.method public final m()V
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/xi0;->R:I

    .line 2
    .line 3
    invoke-static {v0}, Ldefpackage/xa3;->w(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_5

    .line 9
    .line 10
    if-eq v0, v1, :cond_4

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Ldefpackage/xi0;->f()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget p0, p0, Ldefpackage/xi0;->R:I

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    if-eq p0, v0, :cond_3

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    if-eq p0, v0, :cond_2

    .line 26
    .line 27
    const/4 v0, 0x3

    .line 28
    if-eq p0, v0, :cond_1

    .line 29
    .line 30
    const-string p0, "null"

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const-string p0, "DECODE_DATA"

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    const-string p0, "SWITCH_TO_SOURCE_SERVICE"

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_3
    const-string p0, "INITIALIZE"

    .line 40
    .line 41
    :goto_0
    const-string v0, "Unrecognized run reason: "

    .line 42
    .line 43
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_4
    invoke-virtual {p0}, Ldefpackage/xi0;->l()V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_5
    invoke-virtual {p0, v1}, Ldefpackage/xi0;->h(I)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iput v0, p0, Ldefpackage/xi0;->Q:I

    .line 60
    .line 61
    invoke-virtual {p0}, Ldefpackage/xi0;->g()Ldefpackage/uh0;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, Ldefpackage/xi0;->M:Ldefpackage/uh0;

    .line 66
    .line 67
    invoke-virtual {p0}, Ldefpackage/xi0;->l()V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final n()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/xi0;->p:Ldefpackage/ul4;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldefpackage/ul4;->a()V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Ldefpackage/xi0;->N:Z

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Ldefpackage/xi0;->o:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object p0, p0, Ldefpackage/xi0;->o:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    sub-int/2addr v0, v1

    .line 28
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Ljava/lang/Throwable;

    .line 33
    .line 34
    :goto_0
    const-string v0, "Already notified"

    .line 35
    .line 36
    invoke-static {v0, p0}, Ldefpackage/mj0;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    iput-boolean v1, p0, Ldefpackage/xi0;->N:Z

    .line 41
    .line 42
    return-void
.end method

.method public final run()V
    .locals 5

    .line 1
    const-string v0, "DecodeJob"

    .line 2
    .line 3
    const-string v1, "DecodeJob threw unexpectedly, isCancelled: "

    .line 4
    .line 5
    iget-object v2, p0, Ldefpackage/xi0;->L:Ldefpackage/sh0;

    .line 6
    .line 7
    :try_start_0
    iget-boolean v3, p0, Ldefpackage/xi0;->O:Z

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ldefpackage/xi0;->j()V
    :try_end_0
    .catch Ldefpackage/ly; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    invoke-interface {v2}, Ldefpackage/sh0;->c()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception v3

    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception p0

    .line 23
    goto :goto_2

    .line 24
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Ldefpackage/xi0;->m()V
    :try_end_1
    .catch Ldefpackage/ly; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-interface {v2}, Ldefpackage/sh0;->c()V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void

    .line 33
    :goto_0
    const/4 v4, 0x3

    .line 34
    :try_start_2
    invoke-static {v0, v4}, Landroid/util/Ldefpackage/og;->isLoggable(Ljava/lang/String;I)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    new-instance v4, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-boolean v1, p0, Ldefpackage/xi0;->O:Z

    .line 46
    .line 47
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", stage: "

    .line 51
    .line 52
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget v1, p0, Ldefpackage/xi0;->Q:I

    .line 56
    .line 57
    invoke-static {v1}, Ldefpackage/xa3;->y(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-static {v0, v1, v3}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :catchall_1
    move-exception p0

    .line 73
    goto :goto_3

    .line 74
    :cond_2
    :goto_1
    iget v0, p0, Ldefpackage/xi0;->Q:I

    .line 75
    .line 76
    const/4 v1, 0x5

    .line 77
    if-eq v0, v1, :cond_3

    .line 78
    .line 79
    iget-object v0, p0, Ldefpackage/xi0;->o:Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Ldefpackage/xi0;->j()V

    .line 85
    .line 86
    .line 87
    :cond_3
    iget-boolean p0, p0, Ldefpackage/xi0;->O:Z

    .line 88
    .line 89
    if-nez p0, :cond_4

    .line 90
    .line 91
    throw v3

    .line 92
    :cond_4
    throw v3

    .line 93
    :goto_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 94
    :goto_3
    if-eqz v2, :cond_5

    .line 95
    .line 96
    invoke-interface {v2}, Ldefpackage/sh0;->c()V

    .line 97
    .line 98
    .line 99
    :cond_5
    throw p0
.end method
