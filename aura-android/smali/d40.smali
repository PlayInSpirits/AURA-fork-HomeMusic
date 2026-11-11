.class public final Ld40;
.super Lbc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final f:J

.field public final g:J

.field public final h:J

.field public final i:Z


# direct methods
.method public constructor <init>(Lcu4;JJZ)V
    .locals 6

    .line 1
    invoke-direct {p0, p1}, Lbc1;-><init>(Lcu4;)V

    .line 2
    .line 3
    .line 4
    const-wide/high16 v0, -0x8000000000000000L

    .line 5
    .line 6
    cmp-long v0, p4, v0

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    cmp-long v1, p4, p2

    .line 11
    .line 12
    if-ltz v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance p0, Landroidx/media3/exoplayer/source/ClippingMediaSource$IllegalClippingException;

    .line 16
    .line 17
    const/4 p1, 0x2

    .line 18
    invoke-direct/range {p0 .. p5}, Landroidx/media3/exoplayer/source/ClippingMediaSource$IllegalClippingException;-><init>(IJJ)V

    .line 19
    .line 20
    .line 21
    throw p0

    .line 22
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcu4;->h()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, 0x0

    .line 27
    const/4 v3, 0x1

    .line 28
    if-ne v1, v3, :cond_a

    .line 29
    .line 30
    new-instance v1, Lbu4;

    .line 31
    .line 32
    invoke-direct {v1}, Lbu4;-><init>()V

    .line 33
    .line 34
    .line 35
    const-wide/16 v4, 0x0

    .line 36
    .line 37
    invoke-virtual {p1, v2, v1, v4, v5}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {v4, v5, p2, p3}, Ljava/lang/Math;->max(JJ)J

    .line 42
    .line 43
    .line 44
    move-result-wide p2

    .line 45
    if-nez p6, :cond_3

    .line 46
    .line 47
    iget-boolean p6, p1, Lbu4;->j:Z

    .line 48
    .line 49
    if-nez p6, :cond_3

    .line 50
    .line 51
    cmp-long p6, p2, v4

    .line 52
    .line 53
    if-eqz p6, :cond_3

    .line 54
    .line 55
    iget-boolean p6, p1, Lbu4;->g:Z

    .line 56
    .line 57
    if-eqz p6, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    new-instance p0, Landroidx/media3/exoplayer/source/ClippingMediaSource$IllegalClippingException;

    .line 61
    .line 62
    invoke-direct {p0, v3}, Landroidx/media3/exoplayer/source/ClippingMediaSource$IllegalClippingException;-><init>(I)V

    .line 63
    .line 64
    .line 65
    throw p0

    .line 66
    :cond_3
    :goto_1
    if-nez v0, :cond_4

    .line 67
    .line 68
    iget-wide p4, p1, Lbu4;->l:J

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    invoke-static {v4, v5, p4, p5}, Ljava/lang/Math;->max(JJ)J

    .line 72
    .line 73
    .line 74
    move-result-wide p4

    .line 75
    :goto_2
    iget-wide v0, p1, Lbu4;->l:J

    .line 76
    .line 77
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    cmp-long p6, v0, v4

    .line 83
    .line 84
    if-eqz p6, :cond_6

    .line 85
    .line 86
    cmp-long p6, p4, v0

    .line 87
    .line 88
    if-lez p6, :cond_5

    .line 89
    .line 90
    move-wide p4, v0

    .line 91
    :cond_5
    cmp-long p6, p2, p4

    .line 92
    .line 93
    if-lez p6, :cond_6

    .line 94
    .line 95
    move-wide p2, p4

    .line 96
    :cond_6
    iput-wide p2, p0, Ld40;->f:J

    .line 97
    .line 98
    iput-wide p4, p0, Ld40;->g:J

    .line 99
    .line 100
    cmp-long p6, p4, v4

    .line 101
    .line 102
    if-nez p6, :cond_7

    .line 103
    .line 104
    move-wide p2, v4

    .line 105
    goto :goto_3

    .line 106
    :cond_7
    sub-long p2, p4, p2

    .line 107
    .line 108
    :goto_3
    iput-wide p2, p0, Ld40;->h:J

    .line 109
    .line 110
    iget-boolean p1, p1, Lbu4;->h:Z

    .line 111
    .line 112
    if-eqz p1, :cond_9

    .line 113
    .line 114
    if-eqz p6, :cond_8

    .line 115
    .line 116
    cmp-long p1, v0, v4

    .line 117
    .line 118
    if-eqz p1, :cond_9

    .line 119
    .line 120
    cmp-long p1, p4, v0

    .line 121
    .line 122
    if-nez p1, :cond_9

    .line 123
    .line 124
    :cond_8
    move v2, v3

    .line 125
    :cond_9
    iput-boolean v2, p0, Ld40;->i:Z

    .line 126
    .line 127
    return-void

    .line 128
    :cond_a
    new-instance p0, Landroidx/media3/exoplayer/source/ClippingMediaSource$IllegalClippingException;

    .line 129
    .line 130
    invoke-direct {p0, v2}, Landroidx/media3/exoplayer/source/ClippingMediaSource$IllegalClippingException;-><init>(I)V

    .line 131
    .line 132
    .line 133
    throw p0
.end method


# virtual methods
.method public final f(ILzt4;Z)Lzt4;
    .locals 10

    .line 1
    iget-object v2, p0, Lbc1;->e:Lcu4;

    .line 2
    .line 3
    const/4 v3, 0x0

    .line 4
    invoke-virtual {v2, v3, p2, p3}, Lcu4;->f(ILzt4;Z)Lzt4;

    .line 5
    .line 6
    .line 7
    iget-wide v2, p2, Lzt4;->e:J

    .line 8
    .line 9
    iget-wide v4, p0, Ld40;->f:J

    .line 10
    .line 11
    sub-long v6, v2, v4

    .line 12
    .line 13
    iget-wide v2, p0, Ld40;->h:J

    .line 14
    .line 15
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    cmp-long v0, v2, v4

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    sub-long v4, v2, v6

    .line 26
    .line 27
    :goto_0
    iget-object v0, p2, Lzt4;->a:Ljava/lang/Object;

    .line 28
    .line 29
    iget-object v2, p2, Lzt4;->b:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v8, Lz5;->f:Lz5;

    .line 32
    .line 33
    const/4 v9, 0x0

    .line 34
    const/4 v3, 0x0

    .line 35
    move-object v1, v0

    .line 36
    move-object v0, p2

    .line 37
    invoke-virtual/range {v0 .. v9}, Lzt4;->i(Ljava/lang/Object;Ljava/lang/Object;IJJLz5;Z)V

    .line 38
    .line 39
    .line 40
    return-object p2
.end method

.method public final m(ILbu4;J)Lbu4;
    .locals 5

    .line 1
    const/4 p1, 0x0

    .line 2
    const-wide/16 p3, 0x0

    .line 3
    .line 4
    iget-object v0, p0, Lbc1;->e:Lcu4;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2, p3, p4}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 7
    .line 8
    .line 9
    iget-wide p3, p2, Lbu4;->o:J

    .line 10
    .line 11
    iget-wide v0, p0, Ld40;->f:J

    .line 12
    .line 13
    add-long/2addr p3, v0

    .line 14
    iput-wide p3, p2, Lbu4;->o:J

    .line 15
    .line 16
    iget-wide p3, p0, Ld40;->h:J

    .line 17
    .line 18
    iput-wide p3, p2, Lbu4;->l:J

    .line 19
    .line 20
    iget-boolean p1, p0, Ld40;->i:Z

    .line 21
    .line 22
    iput-boolean p1, p2, Lbu4;->h:Z

    .line 23
    .line 24
    iget-wide p3, p2, Lbu4;->k:J

    .line 25
    .line 26
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    cmp-long p1, p3, v2

    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    invoke-static {p3, p4, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 36
    .line 37
    .line 38
    move-result-wide p3

    .line 39
    iput-wide p3, p2, Lbu4;->k:J

    .line 40
    .line 41
    iget-wide p0, p0, Ld40;->g:J

    .line 42
    .line 43
    cmp-long v4, p0, v2

    .line 44
    .line 45
    if-nez v4, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-static {p3, p4, p0, p1}, Ljava/lang/Math;->min(JJ)J

    .line 49
    .line 50
    .line 51
    move-result-wide p3

    .line 52
    :goto_0
    sub-long/2addr p3, v0

    .line 53
    iput-wide p3, p2, Lbu4;->k:J

    .line 54
    .line 55
    :cond_1
    invoke-static {v0, v1}, Lf35;->i0(J)J

    .line 56
    .line 57
    .line 58
    move-result-wide p0

    .line 59
    iget-wide p3, p2, Lbu4;->d:J

    .line 60
    .line 61
    cmp-long v0, p3, v2

    .line 62
    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    add-long/2addr p3, p0

    .line 66
    iput-wide p3, p2, Lbu4;->d:J

    .line 67
    .line 68
    :cond_2
    iget-wide p3, p2, Lbu4;->e:J

    .line 69
    .line 70
    cmp-long v0, p3, v2

    .line 71
    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    add-long/2addr p3, p0

    .line 75
    iput-wide p3, p2, Lbu4;->e:J

    .line 76
    .line 77
    :cond_3
    return-object p2
.end method
