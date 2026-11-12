.class public final synthetic Li82;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# instance fields
.field public final synthetic A:I

.field public final synthetic B:I

.field public final synthetic n:Ldx2;

.field public final synthetic o:Llm0;

.field public final synthetic p:Lac3;

.field public final synthetic q:Lwg4;

.field public final synthetic r:Z

.field public final synthetic s:Ltb;

.field public final synthetic t:F

.field public final synthetic u:Lrv2;

.field public final synthetic v:Ly43;

.field public final synthetic w:Lif1;

.field public final synthetic x:Lgs;

.field public final synthetic y:Lrv2;

.field public final synthetic z:Lr70;


# direct methods
.method public synthetic constructor <init>(Ldx2;Llm0;Lac3;Lwg4;ZLtb;FLrv2;Ly43;Lif1;Lgs;Lrv2;Lr70;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li82;->n:Ldx2;

    .line 5
    .line 6
    iput-object p2, p0, Li82;->o:Llm0;

    .line 7
    .line 8
    iput-object p3, p0, Li82;->p:Lac3;

    .line 9
    .line 10
    iput-object p4, p0, Li82;->q:Lwg4;

    .line 11
    .line 12
    iput-boolean p5, p0, Li82;->r:Z

    .line 13
    .line 14
    iput-object p6, p0, Li82;->s:Ltb;

    .line 15
    .line 16
    iput p7, p0, Li82;->t:F

    .line 17
    .line 18
    iput-object p8, p0, Li82;->u:Lrv2;

    .line 19
    .line 20
    iput-object p9, p0, Li82;->v:Ly43;

    .line 21
    .line 22
    iput-object p10, p0, Li82;->w:Lif1;

    .line 23
    .line 24
    iput-object p11, p0, Li82;->x:Lgs;

    .line 25
    .line 26
    iput-object p12, p0, Li82;->y:Lrv2;

    .line 27
    .line 28
    iput-object p13, p0, Li82;->z:Lr70;

    .line 29
    .line 30
    iput p14, p0, Li82;->A:I

    .line 31
    .line 32
    iput p15, p0, Li82;->B:I

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

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
    iget v1, v0, Li82;->A:I

    .line 15
    .line 16
    or-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    invoke-static {v1}, Lxl;->O(I)I

    .line 19
    .line 20
    .line 21
    move-result v14

    .line 22
    iget v1, v0, Li82;->B:I

    .line 23
    .line 24
    invoke-static {v1}, Lxl;->O(I)I

    .line 25
    .line 26
    .line 27
    move-result v15

    .line 28
    iget-object v1, v0, Li82;->n:Ldx2;

    .line 29
    .line 30
    move-object v2, v1

    .line 31
    iget-object v1, v0, Li82;->o:Llm0;

    .line 32
    .line 33
    move-object v3, v2

    .line 34
    iget-object v2, v0, Li82;->p:Lac3;

    .line 35
    .line 36
    move-object v4, v3

    .line 37
    iget-object v3, v0, Li82;->q:Lwg4;

    .line 38
    .line 39
    move-object v5, v4

    .line 40
    iget-boolean v4, v0, Li82;->r:Z

    .line 41
    .line 42
    move-object v6, v5

    .line 43
    iget-object v5, v0, Li82;->s:Ltb;

    .line 44
    .line 45
    move-object v7, v6

    .line 46
    iget v6, v0, Li82;->t:F

    .line 47
    .line 48
    move-object v8, v7

    .line 49
    iget-object v7, v0, Li82;->u:Lrv2;

    .line 50
    .line 51
    move-object v9, v8

    .line 52
    iget-object v8, v0, Li82;->v:Ly43;

    .line 53
    .line 54
    move-object v10, v9

    .line 55
    iget-object v9, v0, Li82;->w:Lif1;

    .line 56
    .line 57
    move-object v11, v10

    .line 58
    iget-object v10, v0, Li82;->x:Lgs;

    .line 59
    .line 60
    move-object v12, v11

    .line 61
    iget-object v11, v0, Li82;->y:Lrv2;

    .line 62
    .line 63
    iget-object v0, v0, Li82;->z:Lr70;

    .line 64
    .line 65
    move-object/from16 v16, v12

    .line 66
    .line 67
    move-object v12, v0

    .line 68
    move-object/from16 v0, v16

    .line 69
    .line 70
    invoke-static/range {v0 .. v15}, Lya4;->b(Ldx2;Llm0;Lac3;Lwg4;ZLtb;FLrv2;Ly43;Lif1;Lgs;Lrv2;Lr70;Lrg1;II)V

    .line 71
    .line 72
    .line 73
    sget-object v0, Lj15;->a:Lj15;

    .line 74
    .line 75
    return-object v0
.end method
