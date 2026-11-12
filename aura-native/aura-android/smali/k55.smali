.class public final Lk55;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ln71;

.field public final b:Landroid/content/Context;

.field public c:Lg55;

.field public d:Z

.field public e:Landroid/view/Surface;

.field public f:F

.field public g:F

.field public h:F

.field public i:F

.field public j:I

.field public k:J

.field public l:J

.field public m:J

.field public n:J

.field public o:J

.field public p:J

.field public q:J

.field public r:J

.field public s:J


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk55;->b:Landroid/content/Context;

    .line 5
    .line 6
    new-instance p1, Ln71;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lm71;

    .line 12
    .line 13
    invoke-direct {v0}, Lm71;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p1, Ln71;->a:Lm71;

    .line 17
    .line 18
    new-instance v0, Lm71;

    .line 19
    .line 20
    invoke-direct {v0}, Lm71;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p1, Ln71;->b:Lm71;

    .line 24
    .line 25
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    iput-wide v0, p1, Ln71;->d:J

    .line 31
    .line 32
    iput-object p1, p0, Lk55;->a:Ln71;

    .line 33
    .line 34
    const/high16 p1, -0x40800000    # -1.0f

    .line 35
    .line 36
    iput p1, p0, Lk55;->f:F

    .line 37
    .line 38
    const/high16 p1, 0x3f800000    # 1.0f

    .line 39
    .line 40
    iput p1, p0, Lk55;->i:F

    .line 41
    .line 42
    const/4 p1, 0x0

    .line 43
    iput p1, p0, Lk55;->j:I

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lk55;->e:Landroid/view/Surface;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget v1, p0, Lk55;->j:I

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    if-eq v1, v2, :cond_1

    .line 16
    .line 17
    iget v1, p0, Lk55;->h:F

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    cmpl-float v1, v1, v2

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/Surface;->isValid()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iput v2, p0, Lk55;->h:F

    .line 32
    .line 33
    iget-object p0, p0, Lk55;->e:Landroid/view/Surface;

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    :try_start_0
    invoke-static {p0, v2, v0}, Lxq2;->r(Landroid/view/Surface;FI)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catch_0
    move-exception p0

    .line 41
    const-string v0, "VideoFrameReleaseHelper"

    .line 42
    .line 43
    const-string v1, "Failed to call Surface.setFrameRate"

    .line 44
    .line 45
    invoke-static {v0, v1, p0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    :goto_0
    return-void
.end method

.method public final b()V
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lk55;->m:J

    .line 4
    .line 5
    const-wide/16 v2, -0x1

    .line 6
    .line 7
    iput-wide v2, p0, Lk55;->q:J

    .line 8
    .line 9
    iput-wide v2, p0, Lk55;->n:J

    .line 10
    .line 11
    iput-wide v0, p0, Lk55;->k:J

    .line 12
    .line 13
    iput-wide v0, p0, Lk55;->l:J

    .line 14
    .line 15
    return-void
.end method

.method public final c()V
    .locals 9

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    if-lt v0, v1, :cond_9

    .line 6
    .line 7
    iget-object v0, p0, Lk55;->e:Landroid/view/Surface;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_5

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lk55;->a:Ln71;

    .line 14
    .line 15
    iget-object v2, v0, Ln71;->a:Lm71;

    .line 16
    .line 17
    invoke-virtual {v2}, Lm71;->a()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/high16 v3, -0x40800000    # -1.0f

    .line 22
    .line 23
    if-eqz v2, :cond_3

    .line 24
    .line 25
    iget-object v2, v0, Ln71;->a:Lm71;

    .line 26
    .line 27
    invoke-virtual {v2}, Lm71;->a()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    iget-object v2, v0, Ln71;->a:Lm71;

    .line 34
    .line 35
    iget-wide v4, v2, Lm71;->e:J

    .line 36
    .line 37
    const-wide/16 v6, 0x0

    .line 38
    .line 39
    cmp-long v8, v4, v6

    .line 40
    .line 41
    if-nez v8, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    iget-wide v6, v2, Lm71;->f:J

    .line 45
    .line 46
    div-long/2addr v6, v4

    .line 47
    :goto_0
    long-to-double v4, v6

    .line 48
    const-wide v6, 0x41cdcd6500000000L    # 1.0E9

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    div-double/2addr v6, v4

    .line 54
    double-to-float v2, v6

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    move v2, v3

    .line 57
    goto :goto_1

    .line 58
    :cond_3
    iget v2, p0, Lk55;->f:F

    .line 59
    .line 60
    :goto_1
    iget v4, p0, Lk55;->g:F

    .line 61
    .line 62
    cmpl-float v5, v2, v4

    .line 63
    .line 64
    if-nez v5, :cond_4

    .line 65
    .line 66
    goto :goto_5

    .line 67
    :cond_4
    cmpl-float v5, v2, v3

    .line 68
    .line 69
    if-eqz v5, :cond_7

    .line 70
    .line 71
    cmpl-float v3, v4, v3

    .line 72
    .line 73
    if-eqz v3, :cond_7

    .line 74
    .line 75
    iget-object v1, v0, Ln71;->a:Lm71;

    .line 76
    .line 77
    invoke-virtual {v1}, Lm71;->a()Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_6

    .line 82
    .line 83
    iget-object v1, v0, Ln71;->a:Lm71;

    .line 84
    .line 85
    invoke-virtual {v1}, Lm71;->a()Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_5

    .line 90
    .line 91
    iget-object v0, v0, Ln71;->a:Lm71;

    .line 92
    .line 93
    iget-wide v0, v0, Lm71;->f:J

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_5
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    :goto_2
    const-wide v3, 0x12a05f200L

    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    cmp-long v0, v0, v3

    .line 107
    .line 108
    if-ltz v0, :cond_6

    .line 109
    .line 110
    const v0, 0x3dcccccd    # 0.1f

    .line 111
    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_6
    const/high16 v0, 0x3f800000    # 1.0f

    .line 115
    .line 116
    :goto_3
    iget v1, p0, Lk55;->g:F

    .line 117
    .line 118
    sub-float v1, v2, v1

    .line 119
    .line 120
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    cmpl-float v0, v1, v0

    .line 125
    .line 126
    if-ltz v0, :cond_9

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_7
    if-eqz v5, :cond_8

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_8
    iget v0, v0, Ln71;->e:I

    .line 133
    .line 134
    if-lt v0, v1, :cond_9

    .line 135
    .line 136
    :goto_4
    iput v2, p0, Lk55;->g:F

    .line 137
    .line 138
    const/4 v0, 0x0

    .line 139
    invoke-virtual {p0, v0}, Lk55;->d(Z)V

    .line 140
    .line 141
    .line 142
    :cond_9
    :goto_5
    return-void
.end method

.method public final d(Z)V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    if-lt v0, v1, :cond_4

    .line 6
    .line 7
    iget-object v0, p0, Lk55;->e:Landroid/view/Surface;

    .line 8
    .line 9
    if-eqz v0, :cond_4

    .line 10
    .line 11
    iget v1, p0, Lk55;->j:I

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    if-eq v1, v2, :cond_4

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/Surface;->isValid()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_0
    iget-boolean v0, p0, Lk55;->d:Z

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget v0, p0, Lk55;->g:F

    .line 30
    .line 31
    const/high16 v2, -0x40800000    # -1.0f

    .line 32
    .line 33
    cmpl-float v2, v0, v2

    .line 34
    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    iget v2, p0, Lk55;->i:F

    .line 38
    .line 39
    mul-float/2addr v0, v2

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move v0, v1

    .line 42
    :goto_0
    if-nez p1, :cond_2

    .line 43
    .line 44
    iget p1, p0, Lk55;->h:F

    .line 45
    .line 46
    cmpl-float p1, p1, v0

    .line 47
    .line 48
    if-nez p1, :cond_2

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    iput v0, p0, Lk55;->h:F

    .line 52
    .line 53
    iget-object p0, p0, Lk55;->e:Landroid/view/Surface;

    .line 54
    .line 55
    cmpl-float p1, v0, v1

    .line 56
    .line 57
    if-nez p1, :cond_3

    .line 58
    .line 59
    const/4 p1, 0x0

    .line 60
    goto :goto_1

    .line 61
    :cond_3
    const/4 p1, 0x1

    .line 62
    :goto_1
    :try_start_0
    invoke-static {p0, v0, p1}, Lxq2;->r(Landroid/view/Surface;FI)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :catch_0
    move-exception p0

    .line 67
    const-string p1, "VideoFrameReleaseHelper"

    .line 68
    .line 69
    const-string v0, "Failed to call Surface.setFrameRate"

    .line 70
    .line 71
    invoke-static {p1, v0, p0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    :cond_4
    :goto_2
    return-void
.end method
