.class public final Lzk3;
.super Lcu4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final j:Ljava/lang/Object;


# instance fields
.field public final e:Lgn2;

.field public final f:Z

.field public final g:Z

.field public final h:Lan2;

.field public final i:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lzk3;->j:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lal3;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lal3;->a()Lgn2;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lzk3;->e:Lgn2;

    .line 9
    .line 10
    invoke-virtual {p1}, Lal3;->R0()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput-boolean v0, p0, Lzk3;->f:Z

    .line 15
    .line 16
    invoke-virtual {p1}, Lal3;->T0()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iput-boolean v0, p0, Lzk3;->g:Z

    .line 21
    .line 22
    invoke-virtual {p1}, Lal3;->V0()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    sget-object v0, Lan2;->f:Lan2;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    :goto_0
    iput-object v0, p0, Lzk3;->h:Lan2;

    .line 33
    .line 34
    invoke-virtual {p1}, Lal3;->x()J

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    invoke-static {v0, v1}, Lf35;->Q(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    iput-wide v0, p0, Lzk3;->i:J

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)I
    .locals 0

    .line 1
    sget-object p0, Lzk3;->j:Ljava/lang/Object;

    .line 2
    .line 3
    if-eq p0, p1, :cond_0

    .line 4
    .line 5
    const/4 p0, -0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final f(ILzt4;Z)Lzt4;
    .locals 10

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v8, Lz5;->f:Lz5;

    .line 5
    .line 6
    const/4 v9, 0x0

    .line 7
    sget-object v1, Lzk3;->j:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    iget-wide v4, p0, Lzk3;->i:J

    .line 11
    .line 12
    const-wide/16 v6, 0x0

    .line 13
    .line 14
    move-object v2, v1

    .line 15
    move-object v0, p2

    .line 16
    invoke-virtual/range {v0 .. v9}, Lzt4;->i(Ljava/lang/Object;Ljava/lang/Object;IJJLz5;Z)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    iput-boolean p0, v0, Lzt4;->f:Z

    .line 21
    .line 22
    return-object v0
.end method

.method public final h()I
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final l(I)Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p0, Lzk3;->j:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public final m(ILbu4;J)Lbu4;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v18, 0x0

    .line 4
    .line 5
    const-wide/16 v19, 0x0

    .line 6
    .line 7
    sget-object v1, Lzk3;->j:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v2, v0, Lzk3;->e:Lgn2;

    .line 10
    .line 11
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    iget-boolean v10, v0, Lzk3;->f:Z

    .line 22
    .line 23
    iget-boolean v11, v0, Lzk3;->g:Z

    .line 24
    .line 25
    iget-object v12, v0, Lzk3;->h:Lan2;

    .line 26
    .line 27
    const-wide/16 v13, 0x0

    .line 28
    .line 29
    iget-wide v3, v0, Lzk3;->i:J

    .line 30
    .line 31
    const/16 v17, 0x0

    .line 32
    .line 33
    move-object/from16 v0, p2

    .line 34
    .line 35
    move-wide v15, v3

    .line 36
    const/4 v3, 0x0

    .line 37
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    invoke-virtual/range {v0 .. v20}, Lbu4;->b(Ljava/lang/Object;Lgn2;Ljava/lang/Object;JJJZZLan2;JJIIJ)V

    .line 43
    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    iput-boolean v1, v0, Lbu4;->j:Z

    .line 47
    .line 48
    return-object v0
.end method

.method public final o()I
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
