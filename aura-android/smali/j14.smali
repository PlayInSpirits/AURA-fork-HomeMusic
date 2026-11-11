.class public final Lj14;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:Loz3;

.field public b:Lpr3;

.field public c:I

.field public d:Ljava/lang/String;

.field public e:Ljl1;

.field public f:Lsl1;

.field public g:Ln14;

.field public h:Lk14;

.field public i:Lk14;

.field public j:Lk14;

.field public k:J

.field public l:J

.field public m:Ly10;

.field public n:Lgf1;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lj14;->c:I

    .line 6
    .line 7
    sget-object v0, Lxe5;->e:Lfv3;

    .line 8
    .line 9
    iput-object v0, p0, Lj14;->g:Ln14;

    .line 10
    .line 11
    sget-object v0, Lgq1;->q:Lgq1;

    .line 12
    .line 13
    iput-object v0, p0, Lj14;->n:Lgf1;

    .line 14
    .line 15
    new-instance v0, Lsl1;

    .line 16
    .line 17
    invoke-direct {v0}, Lsl1;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lj14;->f:Lsl1;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a()Lk14;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v4, v0, Lj14;->c:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-ltz v4, :cond_3

    .line 7
    .line 8
    move-object v2, v1

    .line 9
    iget-object v1, v0, Lj14;->a:Loz3;

    .line 10
    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    move-object v3, v2

    .line 14
    iget-object v2, v0, Lj14;->b:Lpr3;

    .line 15
    .line 16
    move-object v5, v3

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iget-object v3, v0, Lj14;->d:Ljava/lang/String;

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    iget-object v5, v0, Lj14;->e:Ljl1;

    .line 24
    .line 25
    iget-object v6, v0, Lj14;->f:Lsl1;

    .line 26
    .line 27
    invoke-virtual {v6}, Lsl1;->c()Ltl1;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    iget-object v7, v0, Lj14;->g:Ln14;

    .line 32
    .line 33
    iget-object v8, v0, Lj14;->h:Lk14;

    .line 34
    .line 35
    iget-object v9, v0, Lj14;->i:Lk14;

    .line 36
    .line 37
    iget-object v10, v0, Lj14;->j:Lk14;

    .line 38
    .line 39
    iget-wide v11, v0, Lj14;->k:J

    .line 40
    .line 41
    iget-wide v13, v0, Lj14;->l:J

    .line 42
    .line 43
    iget-object v15, v0, Lj14;->m:Ly10;

    .line 44
    .line 45
    iget-object v0, v0, Lj14;->n:Lgf1;

    .line 46
    .line 47
    move-object/from16 v16, v0

    .line 48
    .line 49
    new-instance v0, Lk14;

    .line 50
    .line 51
    invoke-direct/range {v0 .. v16}, Lk14;-><init>(Loz3;Lpr3;Ljava/lang/String;ILjl1;Ltl1;Ln14;Lk14;Lk14;Lk14;JJLy10;Lgf1;)V

    .line 52
    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_0
    const-string v0, "message == null"

    .line 56
    .line 57
    invoke-static {v0}, Lkf2;->o(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v5

    .line 61
    :cond_1
    const-string v0, "protocol == null"

    .line 62
    .line 63
    invoke-static {v0}, Lkf2;->o(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v5

    .line 67
    :cond_2
    move-object v5, v2

    .line 68
    const-string v0, "request == null"

    .line 69
    .line 70
    invoke-static {v0}, Lkf2;->o(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object v5

    .line 74
    :cond_3
    move-object v5, v1

    .line 75
    const-string v1, "code < 0: "

    .line 76
    .line 77
    iget v0, v0, Lj14;->c:I

    .line 78
    .line 79
    invoke-static {v0, v1}, Lnz2;->e(ILjava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-object v5
.end method
