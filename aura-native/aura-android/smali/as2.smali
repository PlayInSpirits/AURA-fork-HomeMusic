.class public final synthetic Las2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lls2;

.field public final synthetic o:I

.field public final synthetic p:Lms2;

.field public final synthetic q:Lks2;

.field public final synthetic r:Z


# direct methods
.method public synthetic constructor <init>(Lls2;ILms2;Lks2;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Las2;->n:Lls2;

    .line 5
    .line 6
    iput p2, p0, Las2;->o:I

    .line 7
    .line 8
    iput-object p3, p0, Las2;->p:Lms2;

    .line 9
    .line 10
    iput-object p4, p0, Las2;->q:Lks2;

    .line 11
    .line 12
    iput-boolean p5, p0, Las2;->r:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget-object v0, p0, Las2;->q:Lks2;

    .line 2
    .line 3
    iget-object v1, p0, Las2;->n:Lls2;

    .line 4
    .line 5
    iget-object v2, v1, Lls2;->g:Ltn2;

    .line 6
    .line 7
    invoke-virtual {v2}, Ltn2;->l()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    goto/16 :goto_1

    .line 14
    .line 15
    :cond_0
    iget-object v3, v1, Lls2;->m:Lqr2;

    .line 16
    .line 17
    iget-object v3, v3, Lqr2;->o:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Lkr2;

    .line 20
    .line 21
    iget-object v3, v3, Lkr2;->a:Landroid/media/session/MediaSession;

    .line 22
    .line 23
    invoke-virtual {v3}, Landroid/media/session/MediaSession;->isActive()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    iget v4, p0, Las2;->o:I

    .line 28
    .line 29
    iget-object v5, p0, Las2;->p:Lms2;

    .line 30
    .line 31
    const-string v6, "MediaSessionLegacyStub"

    .line 32
    .line 33
    if-nez v3, :cond_1

    .line 34
    .line 35
    const-string p0, "Ignore incoming player command before initialization. command="

    .line 36
    .line 37
    const-string v0, ", pid="

    .line 38
    .line 39
    invoke-static {v4, p0, v0}, Lf34;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    iget-object v0, v5, Lms2;->a:Los2;

    .line 44
    .line 45
    iget v0, v0, Los2;->b:I

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {v6, p0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_1
    invoke-virtual {v1, v5}, Lls2;->M(Lms2;)Lfr2;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    iget-object v1, v1, Lls2;->f:Lna4;

    .line 63
    .line 64
    invoke-virtual {v1, v3, v4}, Lna4;->H(Lfr2;I)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    const/4 v5, 0x1

    .line 69
    if-nez v1, :cond_2

    .line 70
    .line 71
    if-ne v4, v5, :cond_3

    .line 72
    .line 73
    iget-object p0, v2, Ltn2;->s:Lal3;

    .line 74
    .line 75
    invoke-virtual {p0}, Lal3;->q()Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    if-nez p0, :cond_3

    .line 80
    .line 81
    const-string p0, "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground."

    .line 82
    .line 83
    invoke-static {v6, p0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_2
    iget-object v1, v2, Ltn2;->e:Lpq;

    .line 88
    .line 89
    invoke-virtual {v2, v3}, Ltn2;->B(Lfr2;)Lfr2;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    :try_start_0
    invoke-interface {v0, v3}, Lks2;->b(Lfr2;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :catch_0
    move-exception v0

    .line 100
    new-instance v1, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    const-string v7, "Exception in "

    .line 103
    .line 104
    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-static {v6, v1, v0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    :goto_0
    iget-boolean p0, p0, Las2;->r:Z

    .line 118
    .line 119
    if-eqz p0, :cond_3

    .line 120
    .line 121
    new-instance p0, Landroid/util/SparseBooleanArray;

    .line 122
    .line 123
    invoke-direct {p0}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, v4, v5}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 127
    .line 128
    .line 129
    new-instance v0, Lmi3;

    .line 130
    .line 131
    new-instance v1, Lw71;

    .line 132
    .line 133
    invoke-direct {v1, p0}, Lw71;-><init>(Landroid/util/SparseBooleanArray;)V

    .line 134
    .line 135
    .line 136
    invoke-direct {v0, v1}, Lmi3;-><init>(Lw71;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2, v3, v0}, Ltn2;->v(Lfr2;Lmi3;)V

    .line 140
    .line 141
    .line 142
    :cond_3
    :goto_1
    return-void
.end method
