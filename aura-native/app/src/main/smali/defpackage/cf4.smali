.class public final Ldefpackage/cf4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/pz3;


# static fields
.field public static final C:Z


# instance fields
.field public final A:Ljava/lang/RuntimeException;

.field public B:I

.field public final a:Ljava/lang/String;

.field public final b:Ldefpackage/ul4;

.field public final c:Ljava/lang/Object;

.field public final d:Ldefpackage/zz3;

.field public final e:Ldefpackage/wz3;

.field public final f:Ldefpackage/ii1;

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Class;

.field public final i:Ldefpackage/lq;

.field public final j:I

.field public final k:I

.field public final l:Ldefpackage/eq3;

.field public final m:Ldefpackage/wq4;

.field public final n:Ljava/util/List;

.field public final o:Ldefpackage/ex4;

.field public final p:Ljava/util/concurrent/Executor;

.field public q:Ldefpackage/q04;

.field public r:Ldefpackage/z05;

.field public s:J

.field public volatile t:Ldefpackage/i11;

.field public u:Landroid/graphics/drawable/Drawable;

.field public v:Landroid/graphics/drawable/Drawable;

.field public w:Landroid/graphics/drawable/Drawable;

.field public x:I

.field public y:I

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "GlideRequest"

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
    sput-boolean v0, Ldefpackage/cf4;->C:Z

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ldefpackage/ii1;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;Ldefpackage/lq;IILdefpackage/eq3;Ldefpackage/wq4;Ldefpackage/zz3;Ljava/util/ArrayList;Ldefpackage/wz3;Ldefpackage/i11;Ldefpackage/ex4;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-boolean p1, Ldefpackage/cf4;->C:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Ldefpackage/cf4;->a:Ljava/lang/String;

    .line 3
    new-instance p1, Ldefpackage/ul4;

    .line 4
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Ldefpackage/cf4;->b:Ldefpackage/ul4;

    .line 6
    iput-object p3, p0, Ldefpackage/cf4;->c:Ljava/lang/Object;

    .line 7
    iput-object p2, p0, Ldefpackage/cf4;->f:Ldefpackage/ii1;

    .line 8
    iput-object p4, p0, Ldefpackage/cf4;->g:Ljava/lang/Object;

    .line 9
    iput-object p5, p0, Ldefpackage/cf4;->h:Ljava/lang/Class;

    .line 10
    iput-object p6, p0, Ldefpackage/cf4;->i:Ldefpackage/lq;

    .line 11
    iput p7, p0, Ldefpackage/cf4;->j:I

    .line 12
    iput p8, p0, Ldefpackage/cf4;->k:I

    .line 13
    iput-object p9, p0, Ldefpackage/cf4;->l:Ldefpackage/eq3;

    .line 14
    iput-object p10, p0, Ldefpackage/cf4;->m:Ldefpackage/wq4;

    .line 15
    iput-object p11, p0, Ldefpackage/cf4;->d:Ldefpackage/zz3;

    .line 16
    iput-object p12, p0, Ldefpackage/cf4;->n:Ljava/util/List;

    .line 17
    iput-object p13, p0, Ldefpackage/cf4;->e:Ldefpackage/wz3;

    .line 18
    iput-object p14, p0, Ldefpackage/cf4;->t:Ldefpackage/i11;

    .line 19
    iput-object p15, p0, Ldefpackage/cf4;->o:Ldefpackage/ex4;

    move-object/from16 p1, p16

    .line 20
    iput-object p1, p0, Ldefpackage/cf4;->p:Ljava/util/concurrent/Executor;

    const/4 p1, 0x1

    .line 21
    iput p1, p0, Ldefpackage/cf4;->B:I

    .line 22
    iget-object p1, p0, Ldefpackage/cf4;->A:Ljava/lang/RuntimeException;

    if-nez p1, :cond_1

    .line 23
    iget-object p1, p2, Ldefpackage/ii1;->h:Ldefpackage/d34;

    .line 24
    iget-object p1, p1, Ldefpackage/d34;->o:Ljava/lang/Object;

    check-cast p1, Ljava/util/Map;

    .line 25
    const-class p2, Ldefpackage/gi1;

    invoke-interface {p1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 26
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Glide request origin trace"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Ldefpackage/cf4;->A:Ljava/lang/RuntimeException;

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/cf4;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget p0, p0, Ldefpackage/cf4;->B:I

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    if-ne p0, v1, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    :goto_0
    monitor-exit v0

    .line 13
    return p0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p0
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Ldefpackage/cf4;->z:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/cf4;->b:Ldefpackage/ul4;

    .line 6
    .line 7
    invoke-virtual {v0}, Ldefpackage/ul4;->a()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Ldefpackage/cf4;->m:Ldefpackage/wq4;

    .line 11
    .line 12
    invoke-interface {v0, p0}, Ldefpackage/wq4;->b(Ldefpackage/cf4;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Ldefpackage/cf4;->r:Ldefpackage/z05;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v1, v0, Ldefpackage/z05;->q:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Ldefpackage/i11;

    .line 22
    .line 23
    monitor-enter v1

    .line 24
    :try_start_0
    iget-object v2, v0, Ldefpackage/z05;->o:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, Ldefpackage/m11;

    .line 27
    .line 28
    iget-object v0, v0, Ldefpackage/z05;->p:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Ldefpackage/cf4;

    .line 31
    .line 32
    invoke-virtual {v2, v0}, Ldefpackage/m11;->g(Ldefpackage/cf4;)V

    .line 33
    .line 34
    .line 35
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    const/4 v0, 0x0

    .line 37
    iput-object v0, p0, Ldefpackage/cf4;->r:Ldefpackage/z05;

    .line 38
    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    throw p0

    .line 43
    :cond_0
    return-void

    .line 44
    :cond_1
    const-string p0, "You can\'t start or clear loads in RequestListener or Target callbacks. If you\'re trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."

    .line 45
    .line 46
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final c()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/cf4;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Ldefpackage/cf4;->isRunning()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Ldefpackage/cf4;->clear()V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    :goto_0
    monitor-exit v0

    .line 17
    return-void

    .line 18
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw p0
.end method

.method public final clear()V
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/cf4;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Ldefpackage/cf4;->z:Z

    .line 5
    .line 6
    if-nez v1, :cond_5

    .line 7
    .line 8
    iget-object v1, p0, Ldefpackage/cf4;->b:Ldefpackage/ul4;

    .line 9
    .line 10
    invoke-virtual {v1}, Ldefpackage/ul4;->a()V

    .line 11
    .line 12
    .line 13
    iget v1, p0, Ldefpackage/cf4;->B:I

    .line 14
    .line 15
    const/4 v2, 0x6

    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    monitor-exit v0

    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-virtual {p0}, Ldefpackage/cf4;->b()V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Ldefpackage/cf4;->q:Ldefpackage/q04;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    iput-object v3, p0, Ldefpackage/cf4;->q:Ldefpackage/q04;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move-object v1, v3

    .line 34
    :goto_0
    iget-object v3, p0, Ldefpackage/cf4;->e:Ldefpackage/wz3;

    .line 35
    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    invoke-interface {v3, p0}, Ldefpackage/wz3;->g(Ldefpackage/pz3;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_3

    .line 43
    .line 44
    :cond_2
    iget-object v3, p0, Ldefpackage/cf4;->m:Ldefpackage/wq4;

    .line 45
    .line 46
    invoke-virtual {p0}, Ldefpackage/cf4;->f()Landroid/graphics/drawable/Drawable;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-interface {v3, v4}, Ldefpackage/wq4;->m(Landroid/graphics/drawable/Drawable;)V

    .line 51
    .line 52
    .line 53
    :cond_3
    iput v2, p0, Ldefpackage/cf4;->B:I

    .line 54
    .line 55
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    if-eqz v1, :cond_4

    .line 57
    .line 58
    iget-object p0, p0, Ldefpackage/cf4;->t:Ldefpackage/i11;

    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-static {v1}, Ldefpackage/i11;->f(Ldefpackage/q04;)V

    .line 64
    .line 65
    .line 66
    :cond_4
    return-void

    .line 67
    :cond_5
    :try_start_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 68
    .line 69
    const-string v1, "You can\'t start or clear loads in RequestListener or Target callbacks. If you\'re trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."

    .line 70
    .line 71
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p0

    .line 75
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    throw p0
.end method

.method public final d()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/cf4;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget p0, p0, Ldefpackage/cf4;->B:I

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    if-ne p0, v1, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    :goto_0
    monitor-exit v0

    .line 13
    return p0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p0
.end method

.method public final e(Ldefpackage/pz3;)Z
    .locals 14

    .line 1
    instance-of v0, p1, Ldefpackage/cf4;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object v0, p0, Ldefpackage/cf4;->c:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    iget v2, p0, Ldefpackage/cf4;->j:I

    .line 11
    .line 12
    iget v3, p0, Ldefpackage/cf4;->k:I

    .line 13
    .line 14
    iget-object v4, p0, Ldefpackage/cf4;->g:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v5, p0, Ldefpackage/cf4;->h:Ljava/lang/Class;

    .line 17
    .line 18
    iget-object v6, p0, Ldefpackage/cf4;->i:Ldefpackage/lq;

    .line 19
    .line 20
    iget-object v7, p0, Ldefpackage/cf4;->l:Ldefpackage/eq3;

    .line 21
    .line 22
    iget-object p0, p0, Ldefpackage/cf4;->n:Ljava/util/List;

    .line 23
    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    goto :goto_5

    .line 33
    :cond_1
    move p0, v1

    .line 34
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    check-cast p1, Ldefpackage/cf4;

    .line 36
    .line 37
    iget-object v8, p1, Ldefpackage/cf4;->c:Ljava/lang/Object;

    .line 38
    .line 39
    monitor-enter v8

    .line 40
    :try_start_1
    iget v0, p1, Ldefpackage/cf4;->j:I

    .line 41
    .line 42
    iget v9, p1, Ldefpackage/cf4;->k:I

    .line 43
    .line 44
    iget-object v10, p1, Ldefpackage/cf4;->g:Ljava/lang/Object;

    .line 45
    .line 46
    iget-object v11, p1, Ldefpackage/cf4;->h:Ljava/lang/Class;

    .line 47
    .line 48
    iget-object v12, p1, Ldefpackage/cf4;->i:Ldefpackage/lq;

    .line 49
    .line 50
    iget-object v13, p1, Ldefpackage/cf4;->l:Ldefpackage/eq3;

    .line 51
    .line 52
    iget-object p1, p1, Ldefpackage/cf4;->n:Ljava/util/List;

    .line 53
    .line 54
    if-eqz p1, :cond_2

    .line 55
    .line 56
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    goto :goto_1

    .line 61
    :catchall_1
    move-exception p0

    .line 62
    goto :goto_4

    .line 63
    :cond_2
    move p1, v1

    .line 64
    :goto_1
    monitor-exit v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 65
    if-ne v2, v0, :cond_7

    .line 66
    .line 67
    if-ne v3, v9, :cond_7

    .line 68
    .line 69
    const/4 v0, 0x1

    .line 70
    if-nez v4, :cond_4

    .line 71
    .line 72
    if-nez v10, :cond_3

    .line 73
    .line 74
    move v2, v0

    .line 75
    goto :goto_2

    .line 76
    :cond_3
    move v2, v1

    .line 77
    goto :goto_2

    .line 78
    :cond_4
    invoke-virtual {v4, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    :goto_2
    if-eqz v2, :cond_7

    .line 83
    .line 84
    invoke-virtual {v5, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_7

    .line 89
    .line 90
    if-nez v6, :cond_6

    .line 91
    .line 92
    if-nez v12, :cond_5

    .line 93
    .line 94
    move v2, v0

    .line 95
    goto :goto_3

    .line 96
    :cond_5
    move v2, v1

    .line 97
    goto :goto_3

    .line 98
    :cond_6
    invoke-virtual {v6, v12}, Ldefpackage/lq;->i(Ldefpackage/lq;)Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    :goto_3
    if-eqz v2, :cond_7

    .line 103
    .line 104
    if-ne v7, v13, :cond_7

    .line 105
    .line 106
    if-ne p0, p1, :cond_7

    .line 107
    .line 108
    return v0

    .line 109
    :cond_7
    return v1

    .line 110
    :goto_4
    :try_start_2
    monitor-exit v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 111
    throw p0

    .line 112
    :goto_5
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 113
    throw p0
.end method

.method public final f()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/cf4;->v:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/cf4;->i:Ldefpackage/lq;

    .line 6
    .line 7
    iget-object v0, v0, Ldefpackage/lq;->s:Landroid/graphics/drawable/ColorDrawable;

    .line 8
    .line 9
    iput-object v0, p0, Ldefpackage/cf4;->v:Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    :cond_0
    iget-object p0, p0, Ldefpackage/cf4;->v:Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    return-object p0
.end method

.method public final g(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, " this: "

    .line 2
    .line 3
    invoke-static {p1, v0}, Ldefpackage/b11;->s(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p0, p0, Ldefpackage/cf4;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string p1, "GlideRequest"

    .line 17
    .line 18
    invoke-static {p1, p0}, Landroid/util/Ldefpackage/og;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final h(Lcom/bumptech/glide/load/engine/GlideException;I)V
    .locals 7

    .line 1
    const-string v0, "Load failed for ["

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/cf4;->b:Ldefpackage/ul4;

    .line 4
    .line 5
    invoke-virtual {v1}, Ldefpackage/ul4;->a()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Ldefpackage/cf4;->c:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v1

    .line 11
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Ldefpackage/cf4;->f:Ldefpackage/ii1;

    .line 15
    .line 16
    iget v2, v2, Ldefpackage/ii1;->i:I

    .line 17
    .line 18
    if-gt v2, p2, :cond_0

    .line 19
    .line 20
    const-string p2, "Glide"

    .line 21
    .line 22
    new-instance v3, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Ldefpackage/cf4;->g:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v0, "] with dimensions ["

    .line 33
    .line 34
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    iget v0, p0, Ldefpackage/cf4;->x:I

    .line 38
    .line 39
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v0, "x"

    .line 43
    .line 44
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget v0, p0, Ldefpackage/cf4;->y:I

    .line 48
    .line 49
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v0, "]"

    .line 53
    .line 54
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {p2, v0, p1}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 62
    .line 63
    .line 64
    const/4 p2, 0x4

    .line 65
    if-gt v2, p2, :cond_0

    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/bumptech/glide/load/engine/GlideException;->d()V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :catchall_0
    move-exception p0

    .line 72
    goto/16 :goto_6

    .line 73
    .line 74
    :cond_0
    :goto_0
    const/4 p2, 0x0

    .line 75
    iput-object p2, p0, Ldefpackage/cf4;->r:Ldefpackage/z05;

    .line 76
    .line 77
    const/4 v0, 0x5

    .line 78
    iput v0, p0, Ldefpackage/cf4;->B:I

    .line 79
    .line 80
    iget-object v0, p0, Ldefpackage/cf4;->e:Ldefpackage/wz3;

    .line 81
    .line 82
    if-eqz v0, :cond_1

    .line 83
    .line 84
    invoke-interface {v0, p0}, Ldefpackage/wz3;->b(Ldefpackage/pz3;)V

    .line 85
    .line 86
    .line 87
    :cond_1
    const/4 v0, 0x1

    .line 88
    iput-boolean v0, p0, Ldefpackage/cf4;->z:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    .line 90
    const/4 v2, 0x0

    .line 91
    :try_start_1
    iget-object v3, p0, Ldefpackage/cf4;->n:Ljava/util/List;

    .line 92
    .line 93
    if-eqz v3, :cond_3

    .line 94
    .line 95
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    move v4, v2

    .line 100
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    if-eqz v5, :cond_4

    .line 105
    .line 106
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    check-cast v5, Ldefpackage/zz3;

    .line 111
    .line 112
    iget-object v6, p0, Ldefpackage/cf4;->e:Ldefpackage/wz3;

    .line 113
    .line 114
    if-eqz v6, :cond_2

    .line 115
    .line 116
    invoke-interface {v6}, Ldefpackage/wz3;->getRoot()Ldefpackage/wz3;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    invoke-interface {v6}, Ldefpackage/wz3;->a()Z

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    :cond_2
    invoke-interface {v5, p1}, Ldefpackage/zz3;->a(Lcom/bumptech/glide/load/engine/GlideException;)Z

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    or-int/2addr v4, v5

    .line 129
    goto :goto_1

    .line 130
    :catchall_1
    move-exception p1

    .line 131
    goto :goto_5

    .line 132
    :cond_3
    move v4, v2

    .line 133
    :cond_4
    iget-object v3, p0, Ldefpackage/cf4;->d:Ldefpackage/zz3;

    .line 134
    .line 135
    if-eqz v3, :cond_6

    .line 136
    .line 137
    iget-object v5, p0, Ldefpackage/cf4;->e:Ldefpackage/wz3;

    .line 138
    .line 139
    if-eqz v5, :cond_5

    .line 140
    .line 141
    invoke-interface {v5}, Ldefpackage/wz3;->getRoot()Ldefpackage/wz3;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    invoke-interface {v5}, Ldefpackage/wz3;->a()Z

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    :cond_5
    invoke-interface {v3, p1}, Ldefpackage/zz3;->a(Lcom/bumptech/glide/load/engine/GlideException;)Z

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    if-eqz p1, :cond_6

    .line 154
    .line 155
    move p1, v0

    .line 156
    goto :goto_2

    .line 157
    :cond_6
    move p1, v2

    .line 158
    :goto_2
    or-int/2addr p1, v4

    .line 159
    if-nez p1, :cond_f

    .line 160
    .line 161
    iget-object p1, p0, Ldefpackage/cf4;->e:Ldefpackage/wz3;

    .line 162
    .line 163
    if-eqz p1, :cond_8

    .line 164
    .line 165
    invoke-interface {p1, p0}, Ldefpackage/wz3;->h(Ldefpackage/pz3;)Z

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    if-eqz p1, :cond_7

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_7
    move v0, v2

    .line 173
    :cond_8
    :goto_3
    if-nez v0, :cond_9

    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_9
    iget-object p1, p0, Ldefpackage/cf4;->g:Ljava/lang/Object;

    .line 177
    .line 178
    if-nez p1, :cond_b

    .line 179
    .line 180
    iget-object p1, p0, Ldefpackage/cf4;->w:Landroid/graphics/drawable/Drawable;

    .line 181
    .line 182
    if-nez p1, :cond_a

    .line 183
    .line 184
    iget-object p1, p0, Ldefpackage/cf4;->i:Ldefpackage/lq;

    .line 185
    .line 186
    iget-object p1, p1, Ldefpackage/lq;->y:Landroid/graphics/drawable/Drawable;

    .line 187
    .line 188
    iput-object p1, p0, Ldefpackage/cf4;->w:Landroid/graphics/drawable/Drawable;

    .line 189
    .line 190
    :cond_a
    iget-object p2, p0, Ldefpackage/cf4;->w:Landroid/graphics/drawable/Drawable;

    .line 191
    .line 192
    :cond_b
    if-nez p2, :cond_d

    .line 193
    .line 194
    iget-object p1, p0, Ldefpackage/cf4;->u:Landroid/graphics/drawable/Drawable;

    .line 195
    .line 196
    if-nez p1, :cond_c

    .line 197
    .line 198
    iget-object p1, p0, Ldefpackage/cf4;->i:Ldefpackage/lq;

    .line 199
    .line 200
    iget-object p1, p1, Ldefpackage/lq;->r:Landroid/graphics/drawable/Drawable;

    .line 201
    .line 202
    iput-object p1, p0, Ldefpackage/cf4;->u:Landroid/graphics/drawable/Drawable;

    .line 203
    .line 204
    :cond_c
    iget-object p2, p0, Ldefpackage/cf4;->u:Landroid/graphics/drawable/Drawable;

    .line 205
    .line 206
    :cond_d
    if-nez p2, :cond_e

    .line 207
    .line 208
    invoke-virtual {p0}, Ldefpackage/cf4;->f()Landroid/graphics/drawable/Drawable;

    .line 209
    .line 210
    .line 211
    move-result-object p2

    .line 212
    :cond_e
    iget-object p1, p0, Ldefpackage/cf4;->m:Ldefpackage/wq4;

    .line 213
    .line 214
    invoke-interface {p1, p2}, Ldefpackage/wq4;->i(Landroid/graphics/drawable/Drawable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 215
    .line 216
    .line 217
    :cond_f
    :goto_4
    :try_start_2
    iput-boolean v2, p0, Ldefpackage/cf4;->z:Z

    .line 218
    .line 219
    monitor-exit v1

    .line 220
    return-void

    .line 221
    :goto_5
    iput-boolean v2, p0, Ldefpackage/cf4;->z:Z

    .line 222
    .line 223
    throw p1

    .line 224
    :goto_6
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 225
    throw p0
.end method

.method public final i(Ldefpackage/q04;I)V
    .locals 7

    .line 1
    const-string v0, "Expected to receive an object of "

    .line 2
    .line 3
    const-string v1, "Expected to receive a Resource<R> with an object of "

    .line 4
    .line 5
    iget-object v2, p0, Ldefpackage/cf4;->b:Ldefpackage/ul4;

    .line 6
    .line 7
    invoke-virtual {v2}, Ldefpackage/ul4;->a()V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    :try_start_0
    iget-object v3, p0, Ldefpackage/cf4;->c:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 14
    :try_start_1
    iput-object v2, p0, Ldefpackage/cf4;->r:Ldefpackage/z05;

    .line 15
    .line 16
    const/4 v4, 0x5

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    new-instance p1, Lcom/bumptech/glide/load/engine/GlideException;

    .line 20
    .line 21
    new-instance p2, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Ldefpackage/cf4;->h:Ljava/lang/Class;

    .line 27
    .line 28
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v0, " inside, but instead got null."

    .line 32
    .line 33
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-direct {p1, p2}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p1, v4}, Ldefpackage/cf4;->h(Lcom/bumptech/glide/load/engine/GlideException;I)V

    .line 44
    .line 45
    .line 46
    monitor-exit v3

    .line 47
    return-void

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto/16 :goto_5

    .line 50
    .line 51
    :cond_0
    invoke-interface {p1}, Ldefpackage/q04;->get()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    if-eqz v1, :cond_4

    .line 56
    .line 57
    iget-object v5, p0, Ldefpackage/cf4;->h:Ljava/lang/Class;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-nez v5, :cond_1

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_1
    iget-object v0, p0, Ldefpackage/cf4;->e:Ldefpackage/wz3;

    .line 71
    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    invoke-interface {v0, p0}, Ldefpackage/wz3;->i(Ldefpackage/pz3;)Z

    .line 75
    .line 76
    .line 77
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    if-eqz v0, :cond_2

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    :try_start_2
    iput-object v2, p0, Ldefpackage/cf4;->q:Ldefpackage/q04;

    .line 82
    .line 83
    const/4 p2, 0x4

    .line 84
    iput p2, p0, Ldefpackage/cf4;->B:I

    .line 85
    .line 86
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 87
    :goto_0
    iget-object p0, p0, Ldefpackage/cf4;->t:Ldefpackage/i11;

    .line 88
    .line 89
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-static {p1}, Ldefpackage/i11;->f(Ldefpackage/q04;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :catchall_1
    move-exception p2

    .line 97
    move-object v2, p1

    .line 98
    move-object p1, p2

    .line 99
    goto :goto_5

    .line 100
    :cond_3
    :goto_1
    :try_start_3
    invoke-virtual {p0, p1, v1, p2}, Ldefpackage/cf4;->l(Ldefpackage/q04;Ljava/lang/Object;I)V

    .line 101
    .line 102
    .line 103
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 104
    return-void

    .line 105
    :cond_4
    :goto_2
    :try_start_4
    iput-object v2, p0, Ldefpackage/cf4;->q:Ldefpackage/q04;

    .line 106
    .line 107
    new-instance p2, Lcom/bumptech/glide/load/engine/GlideException;

    .line 108
    .line 109
    new-instance v2, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    iget-object v0, p0, Ldefpackage/cf4;->h:Ljava/lang/Class;

    .line 115
    .line 116
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    const-string v0, " but instead got "

    .line 120
    .line 121
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    if-eqz v1, :cond_5

    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    goto :goto_3

    .line 131
    :cond_5
    const-string v0, ""

    .line 132
    .line 133
    :goto_3
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    const-string v0, "{"

    .line 137
    .line 138
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    const-string v0, "} inside Resource{"

    .line 145
    .line 146
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string v0, "}."

    .line 153
    .line 154
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    if-eqz v1, :cond_6

    .line 158
    .line 159
    const-string v0, ""

    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_6
    const-string v0, " To indicate failure return a null Resource object, rather than a Resource object containing null data."

    .line 163
    .line 164
    :goto_4
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-direct {p2, v0}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0, p2, v4}, Ldefpackage/cf4;->h(Lcom/bumptech/glide/load/engine/GlideException;I)V

    .line 175
    .line 176
    .line 177
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 178
    goto :goto_0

    .line 179
    :goto_5
    :try_start_5
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 180
    :try_start_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 181
    :catchall_2
    move-exception p1

    .line 182
    if-eqz v2, :cond_7

    .line 183
    .line 184
    iget-object p0, p0, Ldefpackage/cf4;->t:Ldefpackage/i11;

    .line 185
    .line 186
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-static {v2}, Ldefpackage/i11;->f(Ldefpackage/q04;)V

    .line 190
    .line 191
    .line 192
    :cond_7
    throw p1
.end method

.method public final isRunning()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/cf4;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget p0, p0, Ldefpackage/cf4;->B:I

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    if-eq p0, v1, :cond_1

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    if-ne p0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    goto :goto_1

    .line 15
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 16
    :goto_1
    monitor-exit v0

    .line 17
    return p0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    throw p0
.end method

.method public final j()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/cf4;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget p0, p0, Ldefpackage/cf4;->B:I

    .line 5
    .line 6
    const/4 v1, 0x6

    .line 7
    if-ne p0, v1, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    :goto_0
    monitor-exit v0

    .line 13
    return p0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p0
.end method

.method public final k()V
    .locals 6

    .line 1
    iget-object v0, p0, Ldefpackage/cf4;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Ldefpackage/cf4;->z:Z

    .line 5
    .line 6
    if-nez v1, :cond_e

    .line 7
    .line 8
    iget-object v1, p0, Ldefpackage/cf4;->b:Ldefpackage/ul4;

    .line 9
    .line 10
    invoke-virtual {v1}, Ldefpackage/ul4;->a()V

    .line 11
    .line 12
    .line 13
    sget v1, Ldefpackage/ee2;->b:I

    .line 14
    .line 15
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    iput-wide v1, p0, Ldefpackage/cf4;->s:J

    .line 20
    .line 21
    iget-object v1, p0, Ldefpackage/cf4;->g:Ljava/lang/Object;

    .line 22
    .line 23
    const/4 v2, 0x3

    .line 24
    const/4 v3, 0x5

    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    iget v1, p0, Ldefpackage/cf4;->j:I

    .line 28
    .line 29
    iget v4, p0, Ldefpackage/cf4;->k:I

    .line 30
    .line 31
    invoke-static {v1, v4}, Ldefpackage/e35;->I(II)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    iget v1, p0, Ldefpackage/cf4;->j:I

    .line 38
    .line 39
    iput v1, p0, Ldefpackage/cf4;->x:I

    .line 40
    .line 41
    iget v1, p0, Ldefpackage/cf4;->k:I

    .line 42
    .line 43
    iput v1, p0, Ldefpackage/cf4;->y:I

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    goto/16 :goto_6

    .line 48
    .line 49
    :cond_0
    :goto_0
    iget-object v1, p0, Ldefpackage/cf4;->w:Landroid/graphics/drawable/Drawable;

    .line 50
    .line 51
    if-nez v1, :cond_1

    .line 52
    .line 53
    iget-object v1, p0, Ldefpackage/cf4;->i:Ldefpackage/lq;

    .line 54
    .line 55
    iget-object v1, v1, Ldefpackage/lq;->y:Landroid/graphics/drawable/Drawable;

    .line 56
    .line 57
    iput-object v1, p0, Ldefpackage/cf4;->w:Landroid/graphics/drawable/Drawable;

    .line 58
    .line 59
    :cond_1
    iget-object v1, p0, Ldefpackage/cf4;->w:Landroid/graphics/drawable/Drawable;

    .line 60
    .line 61
    if-nez v1, :cond_2

    .line 62
    .line 63
    move v2, v3

    .line 64
    :cond_2
    new-instance v1, Lcom/bumptech/glide/load/engine/GlideException;

    .line 65
    .line 66
    const-string v3, "Received null model"

    .line 67
    .line 68
    invoke-direct {v1, v3}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v1, v2}, Ldefpackage/cf4;->h(Lcom/bumptech/glide/load/engine/GlideException;I)V

    .line 72
    .line 73
    .line 74
    monitor-exit v0

    .line 75
    return-void

    .line 76
    :cond_3
    iget v1, p0, Ldefpackage/cf4;->B:I

    .line 77
    .line 78
    const/4 v4, 0x2

    .line 79
    if-eq v1, v4, :cond_d

    .line 80
    .line 81
    const/4 v5, 0x4

    .line 82
    if-ne v1, v5, :cond_4

    .line 83
    .line 84
    iget-object v1, p0, Ldefpackage/cf4;->q:Ldefpackage/q04;

    .line 85
    .line 86
    invoke-virtual {p0, v1, v3}, Ldefpackage/cf4;->i(Ldefpackage/q04;I)V

    .line 87
    .line 88
    .line 89
    monitor-exit v0

    .line 90
    return-void

    .line 91
    :cond_4
    iget-object v1, p0, Ldefpackage/cf4;->n:Ljava/util/List;

    .line 92
    .line 93
    if-nez v1, :cond_5

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_5
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eqz v3, :cond_6

    .line 105
    .line 106
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    check-cast v3, Ldefpackage/zz3;

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_6
    :goto_2
    iput v2, p0, Ldefpackage/cf4;->B:I

    .line 114
    .line 115
    iget v1, p0, Ldefpackage/cf4;->j:I

    .line 116
    .line 117
    iget v3, p0, Ldefpackage/cf4;->k:I

    .line 118
    .line 119
    invoke-static {v1, v3}, Ldefpackage/e35;->I(II)Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-eqz v1, :cond_7

    .line 124
    .line 125
    iget v1, p0, Ldefpackage/cf4;->j:I

    .line 126
    .line 127
    iget v3, p0, Ldefpackage/cf4;->k:I

    .line 128
    .line 129
    invoke-virtual {p0, v1, v3}, Ldefpackage/cf4;->m(II)V

    .line 130
    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_7
    iget-object v1, p0, Ldefpackage/cf4;->m:Ldefpackage/wq4;

    .line 134
    .line 135
    invoke-interface {v1, p0}, Ldefpackage/wq4;->d(Ldefpackage/cf4;)V

    .line 136
    .line 137
    .line 138
    :goto_3
    iget v1, p0, Ldefpackage/cf4;->B:I

    .line 139
    .line 140
    if-eq v1, v4, :cond_8

    .line 141
    .line 142
    if-ne v1, v2, :cond_b

    .line 143
    .line 144
    :cond_8
    iget-object v1, p0, Ldefpackage/cf4;->e:Ldefpackage/wz3;

    .line 145
    .line 146
    if-eqz v1, :cond_a

    .line 147
    .line 148
    invoke-interface {v1, p0}, Ldefpackage/wz3;->h(Ldefpackage/pz3;)Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-eqz v1, :cond_9

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_9
    const/4 v1, 0x0

    .line 156
    goto :goto_5

    .line 157
    :cond_a
    :goto_4
    const/4 v1, 0x1

    .line 158
    :goto_5
    if-eqz v1, :cond_b

    .line 159
    .line 160
    iget-object v1, p0, Ldefpackage/cf4;->m:Ldefpackage/wq4;

    .line 161
    .line 162
    invoke-virtual {p0}, Ldefpackage/cf4;->f()Landroid/graphics/drawable/Drawable;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-interface {v1, v2}, Ldefpackage/wq4;->k(Landroid/graphics/drawable/Drawable;)V

    .line 167
    .line 168
    .line 169
    :cond_b
    sget-boolean v1, Ldefpackage/cf4;->C:Z

    .line 170
    .line 171
    if-eqz v1, :cond_c

    .line 172
    .line 173
    new-instance v1, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 176
    .line 177
    .line 178
    const-string v2, "finished run method in "

    .line 179
    .line 180
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    iget-wide v2, p0, Ldefpackage/cf4;->s:J

    .line 184
    .line 185
    invoke-static {v2, v3}, Ldefpackage/ee2;->a(J)D

    .line 186
    .line 187
    .line 188
    move-result-wide v2

    .line 189
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    invoke-virtual {p0, v1}, Ldefpackage/cf4;->g(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    :cond_c
    monitor-exit v0

    .line 200
    return-void

    .line 201
    :cond_d
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 202
    .line 203
    const-string v1, "Cannot restart a running request"

    .line 204
    .line 205
    invoke-direct {p0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw p0

    .line 209
    :cond_e
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 210
    .line 211
    const-string v1, "You can\'t start or clear loads in RequestListener or Target callbacks. If you\'re trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."

    .line 212
    .line 213
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    throw p0

    .line 217
    :goto_6
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 218
    throw p0
.end method

.method public final l(Ldefpackage/q04;Ljava/lang/Object;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/cf4;->e:Ldefpackage/wz3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ldefpackage/wz3;->getRoot()Ldefpackage/wz3;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v1}, Ldefpackage/wz3;->a()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    :cond_0
    const/4 v1, 0x4

    .line 14
    iput v1, p0, Ldefpackage/cf4;->B:I

    .line 15
    .line 16
    iput-object p1, p0, Ldefpackage/cf4;->q:Ldefpackage/q04;

    .line 17
    .line 18
    iget-object p1, p0, Ldefpackage/cf4;->f:Ldefpackage/ii1;

    .line 19
    .line 20
    iget p1, p1, Ldefpackage/ii1;->i:I

    .line 21
    .line 22
    const/4 v1, 0x3

    .line 23
    if-gt p1, v1, :cond_1

    .line 24
    .line 25
    new-instance p1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v1, "Finished loading "

    .line 28
    .line 29
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, " from "

    .line 44
    .line 45
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-static {p3}, Ldefpackage/xa3;->x(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, " for "

    .line 56
    .line 57
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, Ldefpackage/cf4;->g:Ljava/lang/Object;

    .line 61
    .line 62
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v1, " with size ["

    .line 66
    .line 67
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    iget v1, p0, Ldefpackage/cf4;->x:I

    .line 71
    .line 72
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v1, "x"

    .line 76
    .line 77
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    iget v1, p0, Ldefpackage/cf4;->y:I

    .line 81
    .line 82
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v1, "] in "

    .line 86
    .line 87
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    iget-wide v1, p0, Ldefpackage/cf4;->s:J

    .line 91
    .line 92
    invoke-static {v1, v2}, Ldefpackage/ee2;->a(J)D

    .line 93
    .line 94
    .line 95
    move-result-wide v1

    .line 96
    invoke-virtual {p1, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v1, " ms"

    .line 100
    .line 101
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    const-string v1, "Glide"

    .line 109
    .line 110
    invoke-static {v1, p1}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 111
    .line 112
    .line 113
    :cond_1
    if-eqz v0, :cond_2

    .line 114
    .line 115
    invoke-interface {v0, p0}, Ldefpackage/wz3;->f(Ldefpackage/pz3;)V

    .line 116
    .line 117
    .line 118
    :cond_2
    const/4 p1, 0x1

    .line 119
    iput-boolean p1, p0, Ldefpackage/cf4;->z:Z

    .line 120
    .line 121
    const/4 p1, 0x0

    .line 122
    :try_start_0
    iget-object v0, p0, Ldefpackage/cf4;->n:Ljava/util/List;

    .line 123
    .line 124
    if-eqz v0, :cond_3

    .line 125
    .line 126
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-eqz v1, :cond_3

    .line 135
    .line 136
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    check-cast v1, Ldefpackage/zz3;

    .line 141
    .line 142
    invoke-interface {v1, p2}, Ldefpackage/zz3;->g(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :catchall_0
    move-exception p2

    .line 147
    goto :goto_1

    .line 148
    :cond_3
    iget-object v0, p0, Ldefpackage/cf4;->d:Ldefpackage/zz3;

    .line 149
    .line 150
    if-eqz v0, :cond_4

    .line 151
    .line 152
    invoke-interface {v0, p2}, Ldefpackage/zz3;->g(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    :cond_4
    iget-object v0, p0, Ldefpackage/cf4;->o:Ldefpackage/ex4;

    .line 156
    .line 157
    invoke-interface {v0, p3}, Ldefpackage/ex4;->s(I)Ldefpackage/cx4;

    .line 158
    .line 159
    .line 160
    move-result-object p3

    .line 161
    iget-object v0, p0, Ldefpackage/cf4;->m:Ldefpackage/wq4;

    .line 162
    .line 163
    invoke-interface {v0, p2, p3}, Ldefpackage/wq4;->c(Ljava/lang/Object;Ldefpackage/cx4;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 164
    .line 165
    .line 166
    iput-boolean p1, p0, Ldefpackage/cf4;->z:Z

    .line 167
    .line 168
    return-void

    .line 169
    :goto_1
    iput-boolean p1, p0, Ldefpackage/cf4;->z:Z

    .line 170
    .line 171
    throw p2
.end method

.method public final m(II)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    const-string v3, "finished onSizeReady in "

    .line 8
    .line 9
    const-string v4, "finished setup for calling load in "

    .line 10
    .line 11
    const-string v5, "Got onSizeReady in "

    .line 12
    .line 13
    iget-object v6, v0, Ldefpackage/cf4;->b:Ldefpackage/ul4;

    .line 14
    .line 15
    invoke-virtual {v6}, Ldefpackage/ul4;->a()V

    .line 16
    .line 17
    .line 18
    iget-object v6, v0, Ldefpackage/cf4;->c:Ljava/lang/Object;

    .line 19
    .line 20
    monitor-enter v6

    .line 21
    :try_start_0
    sget-boolean v21, Ldefpackage/cf4;->C:Z

    .line 22
    .line 23
    if-eqz v21, :cond_0

    .line 24
    .line 25
    new-instance v7, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v7, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-wide v8, v0, Ldefpackage/cf4;->s:J

    .line 31
    .line 32
    invoke-static {v8, v9}, Ldefpackage/ee2;->a(J)D

    .line 33
    .line 34
    .line 35
    move-result-wide v8

    .line 36
    invoke-virtual {v7, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-virtual {v0, v5}, Ldefpackage/cf4;->g(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    move-object/from16 v22, v6

    .line 49
    .line 50
    goto/16 :goto_4

    .line 51
    .line 52
    :cond_0
    :goto_0
    iget v5, v0, Ldefpackage/cf4;->B:I

    .line 53
    .line 54
    const/4 v7, 0x3

    .line 55
    if-eq v5, v7, :cond_1

    .line 56
    .line 57
    monitor-exit v6

    .line 58
    return-void

    .line 59
    :cond_1
    const/4 v5, 0x2

    .line 60
    iput v5, v0, Ldefpackage/cf4;->B:I

    .line 61
    .line 62
    iget-object v7, v0, Ldefpackage/cf4;->i:Ldefpackage/lq;

    .line 63
    .line 64
    iget v7, v7, Ldefpackage/lq;->o:F

    .line 65
    .line 66
    const/high16 v8, -0x80000000

    .line 67
    .line 68
    if-ne v1, v8, :cond_2

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    int-to-float v1, v1

    .line 72
    mul-float/2addr v1, v7

    .line 73
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    :goto_1
    iput v1, v0, Ldefpackage/cf4;->x:I

    .line 78
    .line 79
    if-ne v2, v8, :cond_3

    .line 80
    .line 81
    move v1, v2

    .line 82
    goto :goto_2

    .line 83
    :cond_3
    int-to-float v1, v2

    .line 84
    mul-float/2addr v7, v1

    .line 85
    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    :goto_2
    iput v1, v0, Ldefpackage/cf4;->y:I

    .line 90
    .line 91
    if-eqz v21, :cond_4

    .line 92
    .line 93
    new-instance v1, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    iget-wide v7, v0, Ldefpackage/cf4;->s:J

    .line 99
    .line 100
    invoke-static {v7, v8}, Ldefpackage/ee2;->a(J)D

    .line 101
    .line 102
    .line 103
    move-result-wide v7

    .line 104
    invoke-virtual {v1, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {v0, v1}, Ldefpackage/cf4;->g(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    :cond_4
    iget-object v2, v0, Ldefpackage/cf4;->t:Ldefpackage/i11;

    .line 115
    .line 116
    move-object v1, v3

    .line 117
    iget-object v3, v0, Ldefpackage/cf4;->f:Ldefpackage/ii1;

    .line 118
    .line 119
    iget-object v4, v0, Ldefpackage/cf4;->g:Ljava/lang/Object;

    .line 120
    .line 121
    iget-object v7, v0, Ldefpackage/cf4;->i:Ldefpackage/lq;

    .line 122
    .line 123
    move v8, v5

    .line 124
    iget-object v5, v7, Ldefpackage/lq;->w:Ldefpackage/f42;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    .line 126
    move-object v9, v6

    .line 127
    :try_start_1
    iget v6, v0, Ldefpackage/cf4;->x:I

    .line 128
    .line 129
    iget v10, v0, Ldefpackage/cf4;->y:I

    .line 130
    .line 131
    move v11, v8

    .line 132
    iget-object v8, v7, Ldefpackage/lq;->B:Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    .line 133
    .line 134
    move-object v12, v9

    .line 135
    :try_start_2
    iget-object v9, v0, Ldefpackage/cf4;->h:Ljava/lang/Class;

    .line 136
    .line 137
    move v13, v10

    .line 138
    iget-object v10, v0, Ldefpackage/cf4;->l:Ldefpackage/eq3;

    .line 139
    .line 140
    move v14, v11

    .line 141
    iget-object v11, v7, Ldefpackage/lq;->p:Ldefpackage/xq0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 142
    .line 143
    move-object v15, v12

    .line 144
    :try_start_3
    iget-object v12, v7, Ldefpackage/lq;->A:Ldefpackage/yx;

    .line 145
    .line 146
    move/from16 v16, v13

    .line 147
    .line 148
    iget-boolean v13, v7, Ldefpackage/lq;->x:Z

    .line 149
    .line 150
    move/from16 v17, v14

    .line 151
    .line 152
    iget-boolean v14, v7, Ldefpackage/lq;->G:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 153
    .line 154
    move-object/from16 v18, v15

    .line 155
    .line 156
    :try_start_4
    iget-object v15, v7, Ldefpackage/lq;->z:Ldefpackage/db3;

    .line 157
    .line 158
    move-object/from16 p1, v1

    .line 159
    .line 160
    iget-boolean v1, v7, Ldefpackage/lq;->t:Z

    .line 161
    .line 162
    move/from16 v19, v1

    .line 163
    .line 164
    iget-boolean v1, v7, Ldefpackage/lq;->H:Z

    .line 165
    .line 166
    iget-boolean v7, v7, Ldefpackage/lq;->F:Z

    .line 167
    .line 168
    move/from16 v20, v1

    .line 169
    .line 170
    iget-object v1, v0, Ldefpackage/cf4;->p:Ljava/util/concurrent/Executor;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 171
    .line 172
    move-object/from16 v22, v18

    .line 173
    .line 174
    move/from16 v18, v7

    .line 175
    .line 176
    move/from16 v7, v16

    .line 177
    .line 178
    move/from16 v16, v19

    .line 179
    .line 180
    move-object/from16 v19, v0

    .line 181
    .line 182
    move/from16 v0, v17

    .line 183
    .line 184
    move/from16 v17, v20

    .line 185
    .line 186
    move-object/from16 v20, v1

    .line 187
    .line 188
    move-object/from16 v1, p1

    .line 189
    .line 190
    :try_start_5
    invoke-virtual/range {v2 .. v20}, Ldefpackage/i11;->a(Ldefpackage/ii1;Ljava/lang/Object;Ldefpackage/f42;IILjava/lang/Class;Ljava/lang/Class;Ldefpackage/eq3;Ldefpackage/xq0;Ldefpackage/yx;ZZLdefpackage/db3;ZZZLdefpackage/cf4;Ljava/util/concurrent/Executor;)Ldefpackage/z05;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    move-object/from16 v3, v19

    .line 195
    .line 196
    iput-object v2, v3, Ldefpackage/cf4;->r:Ldefpackage/z05;

    .line 197
    .line 198
    iget v2, v3, Ldefpackage/cf4;->B:I

    .line 199
    .line 200
    if-eq v2, v0, :cond_5

    .line 201
    .line 202
    const/4 v0, 0x0

    .line 203
    iput-object v0, v3, Ldefpackage/cf4;->r:Ldefpackage/z05;

    .line 204
    .line 205
    goto :goto_3

    .line 206
    :catchall_1
    move-exception v0

    .line 207
    goto :goto_4

    .line 208
    :cond_5
    :goto_3
    if-eqz v21, :cond_6

    .line 209
    .line 210
    new-instance v0, Ljava/lang/StringBuilder;

    .line 211
    .line 212
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    iget-wide v1, v3, Ldefpackage/cf4;->s:J

    .line 216
    .line 217
    invoke-static {v1, v2}, Ldefpackage/ee2;->a(J)D

    .line 218
    .line 219
    .line 220
    move-result-wide v1

    .line 221
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-virtual {v3, v0}, Ldefpackage/cf4;->g(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    :cond_6
    monitor-exit v22

    .line 232
    return-void

    .line 233
    :catchall_2
    move-exception v0

    .line 234
    move-object/from16 v22, v18

    .line 235
    .line 236
    goto :goto_4

    .line 237
    :catchall_3
    move-exception v0

    .line 238
    move-object/from16 v22, v15

    .line 239
    .line 240
    goto :goto_4

    .line 241
    :catchall_4
    move-exception v0

    .line 242
    move-object/from16 v22, v12

    .line 243
    .line 244
    goto :goto_4

    .line 245
    :catchall_5
    move-exception v0

    .line 246
    move-object/from16 v22, v9

    .line 247
    .line 248
    :goto_4
    monitor-exit v22
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 249
    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/cf4;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ldefpackage/cf4;->g:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object v2, p0, Ldefpackage/cf4;->h:Ljava/lang/Class;

    .line 7
    .line 8
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string p0, "[model="

    .line 22
    .line 23
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p0, ", transcodeClass="

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p0, "]"

    .line 38
    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    throw p0
.end method
