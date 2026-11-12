.class public final Lk14;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final A:Lgf1;

.field public B:Lix;

.field public final C:Z

.field public final n:Loz3;

.field public final o:Lpr3;

.field public final p:Ljava/lang/String;

.field public final q:I

.field public final r:Ljl1;

.field public final s:Ltl1;

.field public final t:Ln14;

.field public final u:Lk14;

.field public final v:Lk14;

.field public final w:Lk14;

.field public final x:J

.field public final y:J

.field public final z:Ly10;


# direct methods
.method public constructor <init>(Loz3;Lpr3;Ljava/lang/String;ILjl1;Ltl1;Ln14;Lk14;Lk14;Lk14;JJLy10;Lgf1;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p16 .. p16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lk14;->n:Loz3;

    .line 20
    .line 21
    iput-object p2, p0, Lk14;->o:Lpr3;

    .line 22
    .line 23
    iput-object p3, p0, Lk14;->p:Ljava/lang/String;

    .line 24
    .line 25
    iput p4, p0, Lk14;->q:I

    .line 26
    .line 27
    iput-object p5, p0, Lk14;->r:Ljl1;

    .line 28
    .line 29
    iput-object p6, p0, Lk14;->s:Ltl1;

    .line 30
    .line 31
    iput-object p7, p0, Lk14;->t:Ln14;

    .line 32
    .line 33
    iput-object p8, p0, Lk14;->u:Lk14;

    .line 34
    .line 35
    iput-object p9, p0, Lk14;->v:Lk14;

    .line 36
    .line 37
    iput-object p10, p0, Lk14;->w:Lk14;

    .line 38
    .line 39
    iput-wide p11, p0, Lk14;->x:J

    .line 40
    .line 41
    iput-wide p13, p0, Lk14;->y:J

    .line 42
    .line 43
    iput-object p15, p0, Lk14;->z:Ly10;

    .line 44
    .line 45
    move-object/from16 p1, p16

    .line 46
    .line 47
    iput-object p1, p0, Lk14;->A:Lgf1;

    .line 48
    .line 49
    const/16 p1, 0xc8

    .line 50
    .line 51
    const/4 p2, 0x0

    .line 52
    if-gt p1, p4, :cond_0

    .line 53
    .line 54
    const/16 p1, 0x12c

    .line 55
    .line 56
    if-ge p4, p1, :cond_0

    .line 57
    .line 58
    const/4 p2, 0x1

    .line 59
    :cond_0
    iput-boolean p2, p0, Lk14;->C:Z

    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public final b()Lix;
    .locals 1

    .line 1
    iget-object v0, p0, Lk14;->B:Lix;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget v0, Lix;->n:I

    .line 6
    .line 7
    iget-object v0, p0, Lk14;->s:Ltl1;

    .line 8
    .line 9
    invoke-static {v0}, Lau0;->O(Ltl1;)Lix;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lk14;->B:Lix;

    .line 14
    .line 15
    :cond_0
    return-object v0
.end method

.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lk14;->t:Ln14;

    .line 2
    .line 3
    invoke-virtual {p0}, Ln14;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f()Lj14;
    .locals 3

    .line 1
    new-instance v0, Lj14;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    iput v1, v0, Lj14;->c:I

    .line 8
    .line 9
    sget-object v1, Lxe5;->e:Lfv3;

    .line 10
    .line 11
    iput-object v1, v0, Lj14;->g:Ln14;

    .line 12
    .line 13
    sget-object v1, Lgq1;->q:Lgq1;

    .line 14
    .line 15
    iput-object v1, v0, Lj14;->n:Lgf1;

    .line 16
    .line 17
    iget-object v1, p0, Lk14;->n:Loz3;

    .line 18
    .line 19
    iput-object v1, v0, Lj14;->a:Loz3;

    .line 20
    .line 21
    iget-object v1, p0, Lk14;->o:Lpr3;

    .line 22
    .line 23
    iput-object v1, v0, Lj14;->b:Lpr3;

    .line 24
    .line 25
    iget v1, p0, Lk14;->q:I

    .line 26
    .line 27
    iput v1, v0, Lj14;->c:I

    .line 28
    .line 29
    iget-object v1, p0, Lk14;->p:Ljava/lang/String;

    .line 30
    .line 31
    iput-object v1, v0, Lj14;->d:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v1, p0, Lk14;->r:Ljl1;

    .line 34
    .line 35
    iput-object v1, v0, Lj14;->e:Ljl1;

    .line 36
    .line 37
    iget-object v1, p0, Lk14;->s:Ltl1;

    .line 38
    .line 39
    invoke-virtual {v1}, Ltl1;->d()Lsl1;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iput-object v1, v0, Lj14;->f:Lsl1;

    .line 44
    .line 45
    iget-object v1, p0, Lk14;->t:Ln14;

    .line 46
    .line 47
    iput-object v1, v0, Lj14;->g:Ln14;

    .line 48
    .line 49
    iget-object v1, p0, Lk14;->u:Lk14;

    .line 50
    .line 51
    iput-object v1, v0, Lj14;->h:Lk14;

    .line 52
    .line 53
    iget-object v1, p0, Lk14;->v:Lk14;

    .line 54
    .line 55
    iput-object v1, v0, Lj14;->i:Lk14;

    .line 56
    .line 57
    iget-object v1, p0, Lk14;->w:Lk14;

    .line 58
    .line 59
    iput-object v1, v0, Lj14;->j:Lk14;

    .line 60
    .line 61
    iget-wide v1, p0, Lk14;->x:J

    .line 62
    .line 63
    iput-wide v1, v0, Lj14;->k:J

    .line 64
    .line 65
    iget-wide v1, p0, Lk14;->y:J

    .line 66
    .line 67
    iput-wide v1, v0, Lj14;->l:J

    .line 68
    .line 69
    iget-object v1, p0, Lk14;->z:Ly10;

    .line 70
    .line 71
    iput-object v1, v0, Lj14;->m:Ly10;

    .line 72
    .line 73
    iget-object p0, p0, Lk14;->A:Lgf1;

    .line 74
    .line 75
    iput-object p0, v0, Lj14;->n:Lgf1;

    .line 76
    .line 77
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Response{protocol="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lk14;->o:Lpr3;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", code="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Lk14;->q:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", message="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lk14;->p:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", url="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lk14;->n:Loz3;

    .line 39
    .line 40
    iget-object p0, p0, Loz3;->a:Lgr1;

    .line 41
    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const/16 p0, 0x7d

    .line 46
    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0
.end method
