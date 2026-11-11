.class public abstract Llu;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Lw03;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Llu;->b(Z)Lw03;

    .line 3
    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-static {v0}, Llu;->b(Z)Lw03;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Llu;->a:Lw03;

    .line 11
    .line 12
    return-void
.end method

.method public static final a(Lig3;Ljg3;Lpi2;Lr62;IILhs;)V
    .locals 15

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-interface/range {p2 .. p2}, Lpi2;->t()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget v1, v0, Ljg3;->n:I

    .line 7
    .line 8
    iget v2, v0, Ljg3;->o:I

    .line 9
    .line 10
    int-to-long v3, v1

    .line 11
    const/16 v1, 0x20

    .line 12
    .line 13
    shl-long/2addr v3, v1

    .line 14
    int-to-long v5, v2

    .line 15
    const-wide v7, 0xffffffffL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    and-long/2addr v5, v7

    .line 21
    or-long v10, v3, v5

    .line 22
    .line 23
    move/from16 v2, p4

    .line 24
    .line 25
    int-to-long v2, v2

    .line 26
    shl-long v1, v2, v1

    .line 27
    .line 28
    move/from16 v3, p5

    .line 29
    .line 30
    int-to-long v3, v3

    .line 31
    and-long/2addr v3, v7

    .line 32
    or-long v12, v1, v3

    .line 33
    .line 34
    move-object/from16 v14, p3

    .line 35
    .line 36
    move-object/from16 v9, p6

    .line 37
    .line 38
    invoke-virtual/range {v9 .. v14}, Lhs;->a(JJLr62;)J

    .line 39
    .line 40
    .line 41
    move-result-wide v1

    .line 42
    invoke-static {p0, v0, v1, v2}, Lig3;->j(Lig3;Ljg3;J)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public static final b(Z)Lw03;
    .locals 3

    .line 1
    new-instance v0, Lw03;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lw03;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lfz0;->o:Lhs;

    .line 9
    .line 10
    new-instance v2, Lou;

    .line 11
    .line 12
    invoke-direct {v2, v1, p0}, Lou;-><init>(Lhs;Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1, v2}, Lw03;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget-object v1, Lfz0;->p:Lhs;

    .line 19
    .line 20
    new-instance v2, Lou;

    .line 21
    .line 22
    invoke-direct {v2, v1, p0}, Lou;-><init>(Lhs;Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Lw03;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    sget-object v1, Lfz0;->q:Lhs;

    .line 29
    .line 30
    new-instance v2, Lou;

    .line 31
    .line 32
    invoke-direct {v2, v1, p0}, Lou;-><init>(Lhs;Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1, v2}, Lw03;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    sget-object v1, Lfz0;->r:Lhs;

    .line 39
    .line 40
    new-instance v2, Lou;

    .line 41
    .line 42
    invoke-direct {v2, v1, p0}, Lou;-><init>(Lhs;Z)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Lw03;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object v1, Lfz0;->s:Lhs;

    .line 49
    .line 50
    new-instance v2, Lou;

    .line 51
    .line 52
    invoke-direct {v2, v1, p0}, Lou;-><init>(Lhs;Z)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1, v2}, Lw03;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    sget-object v1, Lfz0;->t:Lhs;

    .line 59
    .line 60
    new-instance v2, Lou;

    .line 61
    .line 62
    invoke-direct {v2, v1, p0}, Lou;-><init>(Lhs;Z)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1, v2}, Lw03;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    sget-object v1, Lfz0;->u:Lhs;

    .line 69
    .line 70
    new-instance v2, Lou;

    .line 71
    .line 72
    invoke-direct {v2, v1, p0}, Lou;-><init>(Lhs;Z)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1, v2}, Lw03;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    sget-object v1, Lfz0;->v:Lhs;

    .line 79
    .line 80
    new-instance v2, Lou;

    .line 81
    .line 82
    invoke-direct {v2, v1, p0}, Lou;-><init>(Lhs;Z)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v1, v2}, Lw03;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    sget-object v1, Lfz0;->w:Lhs;

    .line 89
    .line 90
    new-instance v2, Lou;

    .line 91
    .line 92
    invoke-direct {v2, v1, p0}, Lou;-><init>(Lhs;Z)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v1, v2}, Lw03;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    return-object v0
.end method
