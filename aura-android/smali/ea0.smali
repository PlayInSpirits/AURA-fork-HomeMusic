.class public final Lea0;
.super Lq42;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lxf1;


# instance fields
.field public final synthetic n:Lgr4;

.field public final synthetic o:I

.field public final synthetic p:I

.field public final synthetic q:I

.field public final synthetic r:I

.field public final synthetic s:Z

.field public final synthetic t:Z

.field public final synthetic u:Lrm2;


# direct methods
.method public constructor <init>(Lgr4;IIIIZZLrm2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lea0;->n:Lgr4;

    .line 2
    .line 3
    iput p2, p0, Lea0;->o:I

    .line 4
    .line 5
    iput p3, p0, Lea0;->p:I

    .line 6
    .line 7
    iput p4, p0, Lea0;->q:I

    .line 8
    .line 9
    iput p5, p0, Lea0;->r:I

    .line 10
    .line 11
    iput-boolean p6, p0, Lea0;->s:Z

    .line 12
    .line 13
    iput-boolean p7, p0, Lea0;->t:Z

    .line 14
    .line 15
    iput-object p8, p0, Lea0;->u:Lrm2;

    .line 16
    .line 17
    const/4 p1, 0x3

    .line 18
    invoke-direct {p0, p1}, Lq42;-><init>(I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object v2, p1

    .line 2
    check-cast v2, Ldv3;

    .line 3
    .line 4
    move-object v9, p2

    .line 5
    check-cast v9, Lf6;

    .line 6
    .line 7
    move-object v11, p3

    .line 8
    check-cast v11, Lhy;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance p1, Llr0;

    .line 20
    .line 21
    new-instance p2, Lhg3;

    .line 22
    .line 23
    new-instance v0, Lgv3;

    .line 24
    .line 25
    iget-boolean v8, p0, Lea0;->t:Z

    .line 26
    .line 27
    iget-object v10, p0, Lea0;->u:Lrm2;

    .line 28
    .line 29
    iget-object v1, p0, Lea0;->n:Lgr4;

    .line 30
    .line 31
    iget v3, p0, Lea0;->o:I

    .line 32
    .line 33
    iget v4, p0, Lea0;->p:I

    .line 34
    .line 35
    iget v5, p0, Lea0;->q:I

    .line 36
    .line 37
    iget v6, p0, Lea0;->r:I

    .line 38
    .line 39
    iget-boolean v7, p0, Lea0;->s:Z

    .line 40
    .line 41
    invoke-direct/range {v0 .. v11}, Lgv3;-><init>(Lgr4;Ldv3;IIIIZZLf6;Lrm2;Lhy;)V

    .line 42
    .line 43
    .line 44
    const/16 p0, 0x12

    .line 45
    .line 46
    invoke-direct {p2, p0, v0}, Lhg3;-><init>(ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-direct {p1, p2, v1}, Llr0;-><init>(Lr34;Lgr4;)V

    .line 50
    .line 51
    .line 52
    return-object p1
.end method
