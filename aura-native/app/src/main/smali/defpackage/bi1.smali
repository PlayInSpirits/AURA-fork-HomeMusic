.class public final Ldefpackage/bi1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ldefpackage/vk4;

.field public final b:Landroid/os/Handler;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ldefpackage/c04;

.field public final e:Ldefpackage/zs;

.field public f:Z

.field public g:Z

.field public h:Ldefpackage/vz3;

.field public i:Ldefpackage/zh1;

.field public j:Z

.field public k:Ldefpackage/zh1;

.field public l:Landroid/graphics/Bitmap;

.field public m:Ldefpackage/zh1;

.field public n:I

.field public o:I

.field public p:I


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/a;Ldefpackage/vk4;IILandroid/graphics/Bitmap;)V
    .locals 4

    .line 1
    iget-object v0, p1, Lcom/bumptech/glide/a;->n:Ldefpackage/zs;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/bumptech/glide/a;->p:Ldefpackage/ii1;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Ldefpackage/c04;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Ldefpackage/c04;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Ldefpackage/c04;->g()Ldefpackage/vz3;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance v2, Ldefpackage/g04;

    .line 26
    .line 27
    invoke-direct {v2}, Ldefpackage/lq;-><init>()V

    .line 28
    .line 29
    .line 30
    sget-object v3, Ldefpackage/xq0;->c:Ldefpackage/xq0;

    .line 31
    .line 32
    invoke-virtual {v2, v3}, Ldefpackage/lq;->e(Ldefpackage/xq0;)Ldefpackage/lq;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ldefpackage/g04;

    .line 37
    .line 38
    invoke-virtual {v2}, Ldefpackage/lq;->E()Ldefpackage/lq;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Ldefpackage/g04;

    .line 43
    .line 44
    const/4 v3, 0x1

    .line 45
    invoke-virtual {v2, v3}, Ldefpackage/lq;->y(Z)Ldefpackage/lq;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Ldefpackage/g04;

    .line 50
    .line 51
    invoke-virtual {v2, p3, p4}, Ldefpackage/lq;->q(II)Ldefpackage/lq;

    .line 52
    .line 53
    .line 54
    move-result-object p3

    .line 55
    invoke-virtual {p1, p3}, Ldefpackage/vz3;->G(Ldefpackage/lq;)Ldefpackage/vz3;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    .line 61
    .line 62
    new-instance p3, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object p3, p0, Ldefpackage/bi1;->c:Ljava/util/ArrayList;

    .line 68
    .line 69
    iput-object v1, p0, Ldefpackage/bi1;->d:Ldefpackage/c04;

    .line 70
    .line 71
    new-instance p3, Landroid/os/Handler;

    .line 72
    .line 73
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 74
    .line 75
    .line 76
    move-result-object p4

    .line 77
    new-instance v1, Ldefpackage/ai1;

    .line 78
    .line 79
    const/4 v2, 0x0

    .line 80
    invoke-direct {v1, v2, p0}, Ldefpackage/ai1;-><init>(ILjava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    invoke-direct {p3, p4, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 84
    .line 85
    .line 86
    iput-object v0, p0, Ldefpackage/bi1;->e:Ldefpackage/zs;

    .line 87
    .line 88
    iput-object p3, p0, Ldefpackage/bi1;->b:Landroid/os/Handler;

    .line 89
    .line 90
    iput-object p1, p0, Ldefpackage/bi1;->h:Ldefpackage/vz3;

    .line 91
    .line 92
    iput-object p2, p0, Ldefpackage/bi1;->a:Ldefpackage/vk4;

    .line 93
    .line 94
    sget-object p1, Ldefpackage/m15;->b:Ldefpackage/m15;

    .line 95
    .line 96
    invoke-virtual {p0, p1, p5}, Ldefpackage/bi1;->c(Ldefpackage/uw4;Landroid/graphics/Bitmap;)V

    .line 97
    .line 98
    .line 99
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    .line 1
    iget-boolean v0, p0, Ldefpackage/bi1;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    iget-boolean v0, p0, Ldefpackage/bi1;->g:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    iget-object v0, p0, Ldefpackage/bi1;->m:Ldefpackage/zh1;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iput-object v1, p0, Ldefpackage/bi1;->m:Ldefpackage/zh1;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ldefpackage/bi1;->b(Ldefpackage/zh1;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    const/4 v0, 0x1

    .line 22
    iput-boolean v0, p0, Ldefpackage/bi1;->g:Z

    .line 23
    .line 24
    iget-object v2, p0, Ldefpackage/bi1;->a:Ldefpackage/vk4;

    .line 25
    .line 26
    iget-object v3, v2, Ldefpackage/vk4;->l:Ldefpackage/ci1;

    .line 27
    .line 28
    iget v4, v3, Ldefpackage/ci1;->c:I

    .line 29
    .line 30
    if-lez v4, :cond_4

    .line 31
    .line 32
    iget v5, v2, Ldefpackage/vk4;->k:I

    .line 33
    .line 34
    if-gez v5, :cond_2

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    if-ltz v5, :cond_3

    .line 38
    .line 39
    if-ge v5, v4, :cond_3

    .line 40
    .line 41
    iget-object v3, v3, Ldefpackage/ci1;->e:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Ldefpackage/yh1;

    .line 48
    .line 49
    iget v3, v3, Ldefpackage/yh1;->i:I

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    const/4 v3, -0x1

    .line 53
    goto :goto_1

    .line 54
    :cond_4
    :goto_0
    const/4 v3, 0x0

    .line 55
    :goto_1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 56
    .line 57
    .line 58
    move-result-wide v4

    .line 59
    int-to-long v6, v3

    .line 60
    add-long/2addr v4, v6

    .line 61
    iget v3, v2, Ldefpackage/vk4;->k:I

    .line 62
    .line 63
    add-int/2addr v3, v0

    .line 64
    iget-object v0, v2, Ldefpackage/vk4;->l:Ldefpackage/ci1;

    .line 65
    .line 66
    iget v0, v0, Ldefpackage/ci1;->c:I

    .line 67
    .line 68
    rem-int/2addr v3, v0

    .line 69
    iput v3, v2, Ldefpackage/vk4;->k:I

    .line 70
    .line 71
    new-instance v0, Ldefpackage/zh1;

    .line 72
    .line 73
    iget-object v6, p0, Ldefpackage/bi1;->b:Landroid/os/Handler;

    .line 74
    .line 75
    invoke-direct {v0, v6, v3, v4, v5}, Ldefpackage/zh1;-><init>(Landroid/os/Handler;IJ)V

    .line 76
    .line 77
    .line 78
    iput-object v0, p0, Ldefpackage/bi1;->k:Ldefpackage/zh1;

    .line 79
    .line 80
    iget-object v0, p0, Ldefpackage/bi1;->h:Ldefpackage/vz3;

    .line 81
    .line 82
    new-instance v3, Ldefpackage/s73;

    .line 83
    .line 84
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 85
    .line 86
    .line 87
    move-result-wide v4

    .line 88
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-direct {v3, v4}, Ldefpackage/s73;-><init>(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    new-instance v4, Ldefpackage/g04;

    .line 96
    .line 97
    invoke-direct {v4}, Ldefpackage/lq;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4, v3}, Ldefpackage/lq;->w(Ldefpackage/f42;)Ldefpackage/lq;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    check-cast v3, Ldefpackage/g04;

    .line 105
    .line 106
    invoke-virtual {v0, v3}, Ldefpackage/vz3;->G(Ldefpackage/lq;)Ldefpackage/vz3;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0, v2}, Ldefpackage/vz3;->M(Ldefpackage/vk4;)Ldefpackage/vz3;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    iget-object p0, p0, Ldefpackage/bi1;->k:Ldefpackage/zh1;

    .line 115
    .line 116
    sget-object v2, Ldefpackage/fh0;->g:Ldefpackage/of;

    .line 117
    .line 118
    invoke-virtual {v0, p0, v1, v0, v2}, Ldefpackage/vz3;->J(Ldefpackage/wq4;Ldefpackage/yz3;Ldefpackage/lq;Ljava/util/concurrent/Executor;)V

    .line 119
    .line 120
    .line 121
    :cond_5
    :goto_2
    return-void
.end method

.method public final b(Ldefpackage/zh1;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Ldefpackage/bi1;->g:Z

    .line 3
    .line 4
    iget-boolean v0, p0, Ldefpackage/bi1;->j:Z

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    iget-object v2, p0, Ldefpackage/bi1;->b:Landroid/os/Handler;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v2, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Landroid/os/Message;->sendToTarget()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-boolean v0, p0, Ldefpackage/bi1;->f:Z

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    iput-object p1, p0, Ldefpackage/bi1;->m:Ldefpackage/zh1;

    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    iget-object v0, p1, Ldefpackage/zh1;->t:Landroid/graphics/Bitmap;

    .line 27
    .line 28
    if-eqz v0, :cond_9

    .line 29
    .line 30
    iget-object v0, p0, Ldefpackage/bi1;->l:Landroid/graphics/Bitmap;

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    iget-object v3, p0, Ldefpackage/bi1;->e:Ldefpackage/zs;

    .line 35
    .line 36
    invoke-interface {v3, v0}, Ldefpackage/zs;->d(Landroid/graphics/Bitmap;)V

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    iput-object v0, p0, Ldefpackage/bi1;->l:Landroid/graphics/Bitmap;

    .line 41
    .line 42
    :cond_2
    iget-object v0, p0, Ldefpackage/bi1;->i:Ldefpackage/zh1;

    .line 43
    .line 44
    iput-object p1, p0, Ldefpackage/bi1;->i:Ldefpackage/zh1;

    .line 45
    .line 46
    iget-object p1, p0, Ldefpackage/bi1;->c:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    add-int/lit8 v3, v3, -0x1

    .line 53
    .line 54
    :goto_0
    if-ltz v3, :cond_8

    .line 55
    .line 56
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    check-cast v4, Ldefpackage/vh1;

    .line 61
    .line 62
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    :goto_1
    instance-of v6, v5, Landroid/graphics/drawable/Drawable;

    .line 67
    .line 68
    if-eqz v6, :cond_3

    .line 69
    .line 70
    check-cast v5, Landroid/graphics/drawable/Drawable;

    .line 71
    .line 72
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    goto :goto_1

    .line 77
    :cond_3
    if-nez v5, :cond_4

    .line 78
    .line 79
    invoke-virtual {v4}, Ldefpackage/vh1;->stop()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_4
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 87
    .line 88
    .line 89
    iget-object v5, v4, Ldefpackage/vh1;->n:Ldefpackage/pd;

    .line 90
    .line 91
    iget-object v5, v5, Ldefpackage/pd;->b:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v5, Ldefpackage/bi1;

    .line 94
    .line 95
    iget-object v6, v5, Ldefpackage/bi1;->i:Ldefpackage/zh1;

    .line 96
    .line 97
    const/4 v7, -0x1

    .line 98
    if-eqz v6, :cond_5

    .line 99
    .line 100
    iget v6, v6, Ldefpackage/zh1;->r:I

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_5
    move v6, v7

    .line 104
    :goto_2
    iget-object v5, v5, Ldefpackage/bi1;->a:Ldefpackage/vk4;

    .line 105
    .line 106
    iget-object v5, v5, Ldefpackage/vk4;->l:Ldefpackage/ci1;

    .line 107
    .line 108
    iget v5, v5, Ldefpackage/ci1;->c:I

    .line 109
    .line 110
    add-int/lit8 v5, v5, -0x1

    .line 111
    .line 112
    if-ne v6, v5, :cond_6

    .line 113
    .line 114
    iget v5, v4, Ldefpackage/vh1;->s:I

    .line 115
    .line 116
    add-int/lit8 v5, v5, 0x1

    .line 117
    .line 118
    iput v5, v4, Ldefpackage/vh1;->s:I

    .line 119
    .line 120
    :cond_6
    iget v5, v4, Ldefpackage/vh1;->t:I

    .line 121
    .line 122
    if-eq v5, v7, :cond_7

    .line 123
    .line 124
    iget v6, v4, Ldefpackage/vh1;->s:I

    .line 125
    .line 126
    if-lt v6, v5, :cond_7

    .line 127
    .line 128
    invoke-virtual {v4}, Ldefpackage/vh1;->stop()V

    .line 129
    .line 130
    .line 131
    :cond_7
    :goto_3
    add-int/lit8 v3, v3, -0x1

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_8
    if-eqz v0, :cond_9

    .line 135
    .line 136
    invoke-virtual {v2, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 141
    .line 142
    .line 143
    :cond_9
    invoke-virtual {p0}, Ldefpackage/bi1;->a()V

    .line 144
    .line 145
    .line 146
    return-void
.end method

.method public final c(Ldefpackage/uw4;Landroid/graphics/Bitmap;)V
    .locals 3

    .line 1
    const-string v0, "Argument must not be null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ldefpackage/h12;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p2, v0}, Ldefpackage/h12;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Ldefpackage/bi1;->l:Landroid/graphics/Bitmap;

    .line 10
    .line 11
    iget-object v0, p0, Ldefpackage/bi1;->h:Ldefpackage/vz3;

    .line 12
    .line 13
    new-instance v1, Ldefpackage/g04;

    .line 14
    .line 15
    invoke-direct {v1}, Ldefpackage/lq;-><init>()V

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, p1, v2}, Ldefpackage/lq;->B(Ldefpackage/uw4;Z)Ldefpackage/lq;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {v0, p1}, Ldefpackage/vz3;->G(Ldefpackage/lq;)Ldefpackage/vz3;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Ldefpackage/bi1;->h:Ldefpackage/vz3;

    .line 28
    .line 29
    invoke-static {p2}, Ldefpackage/e35;->v(Landroid/graphics/Bitmap;)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iput p1, p0, Ldefpackage/bi1;->n:I

    .line 34
    .line 35
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    iput p1, p0, Ldefpackage/bi1;->o:I

    .line 40
    .line 41
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    iput p1, p0, Ldefpackage/bi1;->p:I

    .line 46
    .line 47
    return-void
.end method
