.class public final Landroidx/media3/exoplayer/ExoPlaybackException;
.super Landroidx/media3/common/PlaybackException;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final A:I

.field public final B:Lmt2;

.field public final C:Z

.field public final w:I

.field public final x:Ljava/lang/String;

.field public final y:I

.field public final z:Ltb1;


# direct methods
.method public constructor <init>(ILjava/lang/Exception;I)V
    .locals 10

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x4

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move v3, p3

    .line 146
    invoke-direct/range {v0 .. v9}, Landroidx/media3/exoplayer/ExoPlaybackException;-><init>(ILjava/lang/Throwable;ILjava/lang/String;ILtb1;ILmt2;Z)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/Throwable;ILjava/lang/String;ILtb1;ILmt2;Z)V
    .locals 13

    .line 1
    move/from16 v8, p7

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_7

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    const/4 v2, 0x1

    .line 8
    if-eq p1, v2, :cond_1

    .line 9
    .line 10
    if-eq p1, v1, :cond_0

    .line 11
    .line 12
    const-string v1, "Unexpected runtime error"

    .line 13
    .line 14
    :goto_0
    move-object/from16 v5, p4

    .line 15
    .line 16
    move/from16 v6, p5

    .line 17
    .line 18
    move-object/from16 v7, p6

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    const-string v1, "Remote error"

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    move-object/from16 v5, p4

    .line 30
    .line 31
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v4, " error, index="

    .line 35
    .line 36
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    move/from16 v6, p5

    .line 40
    .line 41
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v4, ", format="

    .line 45
    .line 46
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    move-object/from16 v7, p6

    .line 50
    .line 51
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v4, ", format_supported="

    .line 55
    .line 56
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    sget-object v4, Lf35;->a:Ljava/lang/String;

    .line 60
    .line 61
    if-eqz v8, :cond_6

    .line 62
    .line 63
    if-eq v8, v2, :cond_5

    .line 64
    .line 65
    const/4 v2, 0x2

    .line 66
    if-eq v8, v2, :cond_4

    .line 67
    .line 68
    if-eq v8, v1, :cond_3

    .line 69
    .line 70
    const/4 v1, 0x4

    .line 71
    if-ne v8, v1, :cond_2

    .line 72
    .line 73
    const-string v1, "YES"

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    invoke-static {}, Ltb4;->a()V

    .line 77
    .line 78
    .line 79
    throw v0

    .line 80
    :cond_3
    const-string v1, "NO_EXCEEDS_CAPABILITIES"

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    const-string v1, "NO_UNSUPPORTED_DRM"

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_5
    const-string v1, "NO_UNSUPPORTED_SUBTYPE"

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_6
    const-string v1, "NO"

    .line 90
    .line 91
    :goto_1
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    goto :goto_2

    .line 99
    :cond_7
    move-object/from16 v5, p4

    .line 100
    .line 101
    move/from16 v6, p5

    .line 102
    .line 103
    move-object/from16 v7, p6

    .line 104
    .line 105
    const-string v1, "Source error"

    .line 106
    .line 107
    :goto_2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-nez v0, :cond_8

    .line 112
    .line 113
    const-string v0, ": null"

    .line 114
    .line 115
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    :cond_8
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 120
    .line 121
    .line 122
    move-result-wide v10

    .line 123
    move-object v0, p0

    .line 124
    move v4, p1

    .line 125
    move-object v2, p2

    .line 126
    move/from16 v3, p3

    .line 127
    .line 128
    move-object/from16 v9, p8

    .line 129
    .line 130
    move/from16 v12, p9

    .line 131
    .line 132
    invoke-direct/range {v0 .. v12}, Landroidx/media3/exoplayer/ExoPlaybackException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;IILjava/lang/String;ILtb1;ILmt2;JZ)V

    .line 133
    .line 134
    .line 135
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;IILjava/lang/String;ILtb1;ILmt2;JZ)V
    .locals 8

    move/from16 v0, p12

    .line 136
    sget-object v5, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-wide/from16 v6, p10

    invoke-direct/range {v1 .. v7}, Landroidx/media3/common/PlaybackException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILandroid/os/Bundle;J)V

    const/4 p1, 0x0

    const/4 p3, 0x1

    if-eqz v0, :cond_1

    if-ne p4, p3, :cond_0

    goto :goto_0

    :cond_0
    move v2, p1

    goto :goto_1

    :cond_1
    :goto_0
    move v2, p3

    .line 137
    :goto_1
    invoke-static {v2}, Lrr2;->l(Z)V

    if-nez p2, :cond_2

    const/4 p2, 0x3

    if-ne p4, p2, :cond_3

    :cond_2
    move p1, p3

    .line 138
    :cond_3
    invoke-static {p1}, Lrr2;->l(Z)V

    .line 139
    iput p4, p0, Landroidx/media3/exoplayer/ExoPlaybackException;->w:I

    .line 140
    iput-object p5, p0, Landroidx/media3/exoplayer/ExoPlaybackException;->x:Ljava/lang/String;

    .line 141
    iput p6, p0, Landroidx/media3/exoplayer/ExoPlaybackException;->y:I

    .line 142
    iput-object p7, p0, Landroidx/media3/exoplayer/ExoPlaybackException;->z:Ltb1;

    move/from16 p1, p8

    .line 143
    iput p1, p0, Landroidx/media3/exoplayer/ExoPlaybackException;->A:I

    move-object/from16 p1, p9

    .line 144
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlaybackException;->B:Lmt2;

    .line 145
    iput-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlaybackException;->C:Z

    return-void
.end method


# virtual methods
.method public final a(Landroidx/media3/common/PlaybackException;)Z
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/media3/common/PlaybackException;->a(Landroidx/media3/common/PlaybackException;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v0, Lf35;->a:Ljava/lang/String;

    .line 9
    .line 10
    check-cast p1, Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 11
    .line 12
    iget v0, p0, Landroidx/media3/exoplayer/ExoPlaybackException;->w:I

    .line 13
    .line 14
    iget v1, p1, Landroidx/media3/exoplayer/ExoPlaybackException;->w:I

    .line 15
    .line 16
    if-ne v0, v1, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlaybackException;->x:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v1, p1, Landroidx/media3/exoplayer/ExoPlaybackException;->x:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget v0, p0, Landroidx/media3/exoplayer/ExoPlaybackException;->y:I

    .line 29
    .line 30
    iget v1, p1, Landroidx/media3/exoplayer/ExoPlaybackException;->y:I

    .line 31
    .line 32
    if-ne v0, v1, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlaybackException;->z:Ltb1;

    .line 35
    .line 36
    iget-object v1, p1, Landroidx/media3/exoplayer/ExoPlaybackException;->z:Ltb1;

    .line 37
    .line 38
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    iget v0, p0, Landroidx/media3/exoplayer/ExoPlaybackException;->A:I

    .line 45
    .line 46
    iget v1, p1, Landroidx/media3/exoplayer/ExoPlaybackException;->A:I

    .line 47
    .line 48
    if-ne v0, v1, :cond_1

    .line 49
    .line 50
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlaybackException;->B:Lmt2;

    .line 51
    .line 52
    iget-object v1, p1, Landroidx/media3/exoplayer/ExoPlaybackException;->B:Lmt2;

    .line 53
    .line 54
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    iget-boolean p0, p0, Landroidx/media3/exoplayer/ExoPlaybackException;->C:Z

    .line 61
    .line 62
    iget-boolean p1, p1, Landroidx/media3/exoplayer/ExoPlaybackException;->C:Z

    .line 63
    .line 64
    if-ne p0, p1, :cond_1

    .line 65
    .line 66
    const/4 p0, 0x1

    .line 67
    return p0

    .line 68
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 69
    return p0
.end method

.method public final b(Lmt2;)Landroidx/media3/exoplayer/ExoPlaybackException;
    .locals 13

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, Lf35;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-wide v10, p0, Landroidx/media3/common/PlaybackException;->o:J

    .line 14
    .line 15
    iget-boolean v12, p0, Landroidx/media3/exoplayer/ExoPlaybackException;->C:Z

    .line 16
    .line 17
    iget v3, p0, Landroidx/media3/common/PlaybackException;->n:I

    .line 18
    .line 19
    iget v4, p0, Landroidx/media3/exoplayer/ExoPlaybackException;->w:I

    .line 20
    .line 21
    iget-object v5, p0, Landroidx/media3/exoplayer/ExoPlaybackException;->x:Ljava/lang/String;

    .line 22
    .line 23
    iget v6, p0, Landroidx/media3/exoplayer/ExoPlaybackException;->y:I

    .line 24
    .line 25
    iget-object v7, p0, Landroidx/media3/exoplayer/ExoPlaybackException;->z:Ltb1;

    .line 26
    .line 27
    iget v8, p0, Landroidx/media3/exoplayer/ExoPlaybackException;->A:I

    .line 28
    .line 29
    move-object v9, p1

    .line 30
    invoke-direct/range {v0 .. v12}, Landroidx/media3/exoplayer/ExoPlaybackException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;IILjava/lang/String;ILtb1;ILmt2;JZ)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method
