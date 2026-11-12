.class public final Leb0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lq84;
.implements Lm84;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:I

.field public final d:J

.field public final e:I

.field public final f:J

.field public final g:Z

.field public final h:Z

.field public final i:J

.field public final j:I

.field public final k:I

.field public final l:Z

.field public final m:J


# direct methods
.method public constructor <init>(JJIIZZ)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Leb0;->a:J

    .line 5
    .line 6
    iput-wide p3, p0, Leb0;->b:J

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    if-ne p6, v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v0, p6

    .line 14
    :goto_0
    iput v0, p0, Leb0;->c:I

    .line 15
    .line 16
    iput p5, p0, Leb0;->e:I

    .line 17
    .line 18
    iput-boolean p7, p0, Leb0;->g:Z

    .line 19
    .line 20
    iput-boolean p8, p0, Leb0;->h:Z

    .line 21
    .line 22
    const-wide/16 v0, -0x1

    .line 23
    .line 24
    cmp-long p8, p1, v0

    .line 25
    .line 26
    if-nez p8, :cond_1

    .line 27
    .line 28
    iput-wide v0, p0, Leb0;->d:J

    .line 29
    .line 30
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    iput-wide v0, p0, Leb0;->f:J

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    sub-long v0, p1, p3

    .line 39
    .line 40
    iput-wide v0, p0, Leb0;->d:J

    .line 41
    .line 42
    const-wide/16 v2, 0x0

    .line 43
    .line 44
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    const-wide/32 v2, 0x7a1200

    .line 49
    .line 50
    .line 51
    mul-long/2addr v0, v2

    .line 52
    int-to-long v2, p5

    .line 53
    div-long/2addr v0, v2

    .line 54
    iput-wide v0, p0, Leb0;->f:J

    .line 55
    .line 56
    :goto_1
    iput-wide p3, p0, Leb0;->i:J

    .line 57
    .line 58
    iput p5, p0, Leb0;->j:I

    .line 59
    .line 60
    iput p6, p0, Leb0;->k:I

    .line 61
    .line 62
    iput-boolean p7, p0, Leb0;->l:Z

    .line 63
    .line 64
    const-wide/16 p3, -0x1

    .line 65
    .line 66
    cmp-long p5, p1, p3

    .line 67
    .line 68
    if-eqz p5, :cond_2

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_2
    move-wide p1, p3

    .line 72
    :goto_2
    iput-wide p1, p0, Leb0;->m:J

    .line 73
    .line 74
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-wide v0, p0, Leb0;->m:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final b()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Leb0;->d:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-boolean p0, p0, Leb0;->g:Z

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public final c(J)J
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iget-wide v2, p0, Leb0;->b:J

    .line 4
    .line 5
    sub-long/2addr p1, v2

    .line 6
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    const-wide/32 v0, 0x7a1200

    .line 11
    .line 12
    .line 13
    mul-long/2addr p1, v0

    .line 14
    iget p0, p0, Leb0;->e:I

    .line 15
    .line 16
    int-to-long v0, p0

    .line 17
    div-long/2addr p1, v0

    .line 18
    return-wide p1
.end method

.method public final d()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Leb0;->h:Z

    .line 2
    .line 3
    return p0
.end method

.method public final e(J)Ll84;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-wide/16 v1, -0x1

    .line 4
    .line 5
    iget-wide v3, v0, Leb0;->d:J

    .line 6
    .line 7
    cmp-long v1, v3, v1

    .line 8
    .line 9
    iget-wide v5, v0, Leb0;->b:J

    .line 10
    .line 11
    const-wide/16 v7, 0x0

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    iget-boolean v2, v0, Leb0;->g:Z

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    new-instance v0, Ll84;

    .line 20
    .line 21
    new-instance v1, Lo84;

    .line 22
    .line 23
    invoke-direct {v1, v7, v8, v5, v6}, Lo84;-><init>(JJ)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, v1, v1}, Ll84;-><init>(Lo84;Lo84;)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_0
    iget v2, v0, Leb0;->e:I

    .line 31
    .line 32
    int-to-long v9, v2

    .line 33
    mul-long v9, v9, p1

    .line 34
    .line 35
    const-wide/32 v11, 0x7a1200

    .line 36
    .line 37
    .line 38
    div-long/2addr v9, v11

    .line 39
    iget v13, v0, Leb0;->c:I

    .line 40
    .line 41
    int-to-long v13, v13

    .line 42
    div-long/2addr v9, v13

    .line 43
    mul-long/2addr v9, v13

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    sub-long/2addr v3, v13

    .line 47
    invoke-static {v9, v10, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 48
    .line 49
    .line 50
    move-result-wide v9

    .line 51
    :cond_1
    invoke-static {v9, v10, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 52
    .line 53
    .line 54
    move-result-wide v3

    .line 55
    add-long/2addr v3, v5

    .line 56
    sub-long v9, v3, v5

    .line 57
    .line 58
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->max(JJ)J

    .line 59
    .line 60
    .line 61
    move-result-wide v9

    .line 62
    mul-long/2addr v9, v11

    .line 63
    move-wide v15, v11

    .line 64
    int-to-long v11, v2

    .line 65
    div-long/2addr v9, v11

    .line 66
    new-instance v11, Lo84;

    .line 67
    .line 68
    invoke-direct {v11, v9, v10, v3, v4}, Lo84;-><init>(JJ)V

    .line 69
    .line 70
    .line 71
    if-eqz v1, :cond_3

    .line 72
    .line 73
    cmp-long v1, v9, p1

    .line 74
    .line 75
    if-gez v1, :cond_3

    .line 76
    .line 77
    add-long/2addr v3, v13

    .line 78
    iget-wide v0, v0, Leb0;->a:J

    .line 79
    .line 80
    cmp-long v0, v3, v0

    .line 81
    .line 82
    if-ltz v0, :cond_2

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    sub-long v0, v3, v5

    .line 86
    .line 87
    invoke-static {v7, v8, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 88
    .line 89
    .line 90
    move-result-wide v0

    .line 91
    mul-long/2addr v0, v15

    .line 92
    int-to-long v5, v2

    .line 93
    div-long/2addr v0, v5

    .line 94
    new-instance v2, Lo84;

    .line 95
    .line 96
    invoke-direct {v2, v0, v1, v3, v4}, Lo84;-><init>(JJ)V

    .line 97
    .line 98
    .line 99
    new-instance v0, Ll84;

    .line 100
    .line 101
    invoke-direct {v0, v11, v2}, Ll84;-><init>(Lo84;Lo84;)V

    .line 102
    .line 103
    .line 104
    return-object v0

    .line 105
    :cond_3
    :goto_0
    new-instance v0, Ll84;

    .line 106
    .line 107
    invoke-direct {v0, v11, v11}, Ll84;-><init>(Lo84;Lo84;)V

    .line 108
    .line 109
    .line 110
    return-object v0
.end method

.method public final f()I
    .locals 0

    .line 1
    iget p0, p0, Leb0;->j:I

    .line 2
    .line 3
    return p0
.end method

.method public final g()J
    .locals 2

    .line 1
    iget-wide v0, p0, Leb0;->f:J

    .line 2
    .line 3
    return-wide v0
.end method
