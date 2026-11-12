.class public final Lo31;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final A:I

.field public final B:I

.field public final C:Z

.field public D:Z

.field public final E:Ljava/lang/String;

.field public final F:Z

.field public final a:Lcom/eddyizm/tempus/service/MediaService;

.field public final b:Lvp4;

.field public c:Lgo4;

.field public d:Lgo4;

.field public final e:Ln31;

.field public f:Lgo4;

.field public final g:Ln31;

.field public final h:Landroid/os/Looper;

.field public final i:I

.field public j:Lil;

.field public k:Z

.field public l:I

.field public m:Z

.field public n:Z

.field public final o:I

.field public final p:Z

.field public final q:Ln84;

.field public final r:Li74;

.field public final s:J

.field public final t:J

.field public final u:J

.field public final v:Lul0;

.field public final w:J

.field public final x:J

.field public final y:I

.field public final z:I


# direct methods
.method public constructor <init>(Lcom/eddyizm/tempus/service/MediaService;)V
    .locals 8

    .line 1
    new-instance v0, Ln31;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, Ln31;-><init>(Lcom/eddyizm/tempus/service/MediaService;I)V

    .line 5
    .line 6
    .line 7
    new-instance v2, Ln31;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    invoke-direct {v2, p1, v3}, Ln31;-><init>(Lcom/eddyizm/tempus/service/MediaService;I)V

    .line 11
    .line 12
    .line 13
    new-instance v4, Ln31;

    .line 14
    .line 15
    const/4 v5, 0x2

    .line 16
    invoke-direct {v4, p1, v5}, Ln31;-><init>(Lcom/eddyizm/tempus/service/MediaService;I)V

    .line 17
    .line 18
    .line 19
    new-instance v5, Ldi0;

    .line 20
    .line 21
    const/4 v6, 0x3

    .line 22
    invoke-direct {v5, v6}, Ldi0;-><init>(I)V

    .line 23
    .line 24
    .line 25
    new-instance v7, Ln31;

    .line 26
    .line 27
    invoke-direct {v7, p1, v6}, Ln31;-><init>(Lcom/eddyizm/tempus/service/MediaService;I)V

    .line 28
    .line 29
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lo31;->a:Lcom/eddyizm/tempus/service/MediaService;

    .line 34
    .line 35
    iput-object v0, p0, Lo31;->c:Lgo4;

    .line 36
    .line 37
    iput-object v2, p0, Lo31;->d:Lgo4;

    .line 38
    .line 39
    iput-object v4, p0, Lo31;->e:Ln31;

    .line 40
    .line 41
    iput-object v5, p0, Lo31;->f:Lgo4;

    .line 42
    .line 43
    iput-object v7, p0, Lo31;->g:Ln31;

    .line 44
    .line 45
    invoke-static {}, Lf35;->x()Landroid/os/Looper;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p0, Lo31;->h:Landroid/os/Looper;

    .line 50
    .line 51
    sget-object p1, Lil;->i:Lil;

    .line 52
    .line 53
    iput-object p1, p0, Lo31;->j:Lil;

    .line 54
    .line 55
    iput v1, p0, Lo31;->l:I

    .line 56
    .line 57
    iput v3, p0, Lo31;->o:I

    .line 58
    .line 59
    iput-boolean v3, p0, Lo31;->p:Z

    .line 60
    .line 61
    sget-object p1, Ln84;->d:Ln84;

    .line 62
    .line 63
    iput-object p1, p0, Lo31;->q:Ln84;

    .line 64
    .line 65
    const-wide/16 v0, 0x1388

    .line 66
    .line 67
    iput-wide v0, p0, Lo31;->s:J

    .line 68
    .line 69
    const-wide/16 v0, 0x3a98

    .line 70
    .line 71
    iput-wide v0, p0, Lo31;->t:J

    .line 72
    .line 73
    const-wide/16 v0, 0xbb8

    .line 74
    .line 75
    iput-wide v0, p0, Lo31;->u:J

    .line 76
    .line 77
    sget-object p1, Li74;->b:Li74;

    .line 78
    .line 79
    iput-object p1, p0, Lo31;->r:Li74;

    .line 80
    .line 81
    const-wide/16 v0, 0x14

    .line 82
    .line 83
    invoke-static {v0, v1}, Lf35;->Q(J)J

    .line 84
    .line 85
    .line 86
    move-result-wide v0

    .line 87
    const-wide/16 v4, 0x1f4

    .line 88
    .line 89
    invoke-static {v4, v5}, Lf35;->Q(J)J

    .line 90
    .line 91
    .line 92
    move-result-wide v6

    .line 93
    new-instance p1, Lul0;

    .line 94
    .line 95
    invoke-direct {p1, v0, v1, v6, v7}, Lul0;-><init>(JJ)V

    .line 96
    .line 97
    .line 98
    iput-object p1, p0, Lo31;->v:Lul0;

    .line 99
    .line 100
    sget-object p1, Lvp4;->a:Lvp4;

    .line 101
    .line 102
    iput-object p1, p0, Lo31;->b:Lvp4;

    .line 103
    .line 104
    iput-wide v4, p0, Lo31;->w:J

    .line 105
    .line 106
    const-wide/16 v0, 0x7d0

    .line 107
    .line 108
    iput-wide v0, p0, Lo31;->x:J

    .line 109
    .line 110
    const p1, 0x927c0

    .line 111
    .line 112
    .line 113
    iput p1, p0, Lo31;->y:I

    .line 114
    .line 115
    sget v0, Landroidx/media3/exoplayer/ExoPlayer;->a:I

    .line 116
    .line 117
    iput v0, p0, Lo31;->z:I

    .line 118
    .line 119
    const v0, 0xea60

    .line 120
    .line 121
    .line 122
    iput v0, p0, Lo31;->A:I

    .line 123
    .line 124
    iput p1, p0, Lo31;->B:I

    .line 125
    .line 126
    iput-boolean v3, p0, Lo31;->C:Z

    .line 127
    .line 128
    const-string p1, ""

    .line 129
    .line 130
    iput-object p1, p0, Lo31;->E:Ljava/lang/String;

    .line 131
    .line 132
    const/16 p1, -0x3e8

    .line 133
    .line 134
    iput p1, p0, Lo31;->i:I

    .line 135
    .line 136
    new-instance p1, Lom0;

    .line 137
    .line 138
    invoke-direct {p1}, Lom0;-><init>()V

    .line 139
    .line 140
    .line 141
    iput-boolean v3, p0, Lo31;->F:Z

    .line 142
    .line 143
    return-void
.end method
