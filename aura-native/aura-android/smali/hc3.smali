.class public final synthetic Lhc3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# instance fields
.field public final synthetic n:Llm0;

.field public final synthetic o:Ldx2;

.field public final synthetic p:Lac3;

.field public final synthetic q:Lrv2;

.field public final synthetic r:F

.field public final synthetic s:Lgs;

.field public final synthetic t:Lwg4;

.field public final synthetic u:Z

.field public final synthetic v:Lif1;

.field public final synthetic w:Ly43;

.field public final synthetic x:Lrv2;

.field public final synthetic y:Ltb;

.field public final synthetic z:Lr70;


# direct methods
.method public synthetic constructor <init>(Llm0;Ldx2;Lac3;Lrv2;FLgs;Lwg4;ZLif1;Ly43;Lrv2;Ltb;Lr70;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhc3;->n:Llm0;

    .line 5
    .line 6
    iput-object p2, p0, Lhc3;->o:Ldx2;

    .line 7
    .line 8
    iput-object p3, p0, Lhc3;->p:Lac3;

    .line 9
    .line 10
    iput-object p4, p0, Lhc3;->q:Lrv2;

    .line 11
    .line 12
    iput p5, p0, Lhc3;->r:F

    .line 13
    .line 14
    iput-object p6, p0, Lhc3;->s:Lgs;

    .line 15
    .line 16
    iput-object p7, p0, Lhc3;->t:Lwg4;

    .line 17
    .line 18
    iput-boolean p8, p0, Lhc3;->u:Z

    .line 19
    .line 20
    iput-object p9, p0, Lhc3;->v:Lif1;

    .line 21
    .line 22
    iput-object p10, p0, Lhc3;->w:Ly43;

    .line 23
    .line 24
    iput-object p11, p0, Lhc3;->x:Lrv2;

    .line 25
    .line 26
    iput-object p12, p0, Lhc3;->y:Ltb;

    .line 27
    .line 28
    iput-object p13, p0, Lhc3;->z:Lr70;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v13, p1

    .line 4
    .line 5
    check-cast v13, Lrg1;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const v1, 0x301b1

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Lxl;->O(I)I

    .line 18
    .line 19
    .line 20
    move-result v14

    .line 21
    iget-object v1, v0, Lhc3;->n:Llm0;

    .line 22
    .line 23
    move-object v2, v1

    .line 24
    iget-object v1, v0, Lhc3;->o:Ldx2;

    .line 25
    .line 26
    move-object v3, v2

    .line 27
    iget-object v2, v0, Lhc3;->p:Lac3;

    .line 28
    .line 29
    move-object v4, v3

    .line 30
    iget-object v3, v0, Lhc3;->q:Lrv2;

    .line 31
    .line 32
    move-object v5, v4

    .line 33
    iget v4, v0, Lhc3;->r:F

    .line 34
    .line 35
    move-object v6, v5

    .line 36
    iget-object v5, v0, Lhc3;->s:Lgs;

    .line 37
    .line 38
    move-object v7, v6

    .line 39
    iget-object v6, v0, Lhc3;->t:Lwg4;

    .line 40
    .line 41
    move-object v8, v7

    .line 42
    iget-boolean v7, v0, Lhc3;->u:Z

    .line 43
    .line 44
    move-object v9, v8

    .line 45
    iget-object v8, v0, Lhc3;->v:Lif1;

    .line 46
    .line 47
    move-object v10, v9

    .line 48
    iget-object v9, v0, Lhc3;->w:Ly43;

    .line 49
    .line 50
    move-object v11, v10

    .line 51
    iget-object v10, v0, Lhc3;->x:Lrv2;

    .line 52
    .line 53
    move-object v12, v11

    .line 54
    iget-object v11, v0, Lhc3;->y:Ltb;

    .line 55
    .line 56
    iget-object v0, v0, Lhc3;->z:Lr70;

    .line 57
    .line 58
    move-object v15, v12

    .line 59
    move-object v12, v0

    .line 60
    move-object v0, v15

    .line 61
    invoke-static/range {v0 .. v14}, Luc5;->a(Llm0;Ldx2;Lac3;Lrv2;FLgs;Lwg4;ZLif1;Ly43;Lrv2;Ltb;Lr70;Lrg1;I)V

    .line 62
    .line 63
    .line 64
    sget-object v0, Lj15;->a:Lj15;

    .line 65
    .line 66
    return-object v0
.end method
