.class public final synthetic Lyv1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# instance fields
.field public final synthetic n:Lhd3;

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Ldx2;

.field public final synthetic q:Lhs;

.field public final synthetic r:Li80;

.field public final synthetic s:F

.field public final synthetic t:I

.field public final synthetic u:I


# direct methods
.method public synthetic constructor <init>(Lhd3;Ljava/lang/String;Ldx2;Lhs;Li80;FII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyv1;->n:Lhd3;

    .line 5
    .line 6
    iput-object p2, p0, Lyv1;->o:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lyv1;->p:Ldx2;

    .line 9
    .line 10
    iput-object p4, p0, Lyv1;->q:Lhs;

    .line 11
    .line 12
    iput-object p5, p0, Lyv1;->r:Li80;

    .line 13
    .line 14
    iput p6, p0, Lyv1;->s:F

    .line 15
    .line 16
    iput p7, p0, Lyv1;->t:I

    .line 17
    .line 18
    iput p8, p0, Lyv1;->u:I

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    move-object v6, p1

    .line 2
    check-cast v6, Lrg1;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lyv1;->t:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lxl;->O(I)I

    .line 14
    .line 15
    .line 16
    move-result v7

    .line 17
    iget-object v0, p0, Lyv1;->n:Lhd3;

    .line 18
    .line 19
    iget-object v1, p0, Lyv1;->o:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v2, p0, Lyv1;->p:Ldx2;

    .line 22
    .line 23
    iget-object v3, p0, Lyv1;->q:Lhs;

    .line 24
    .line 25
    iget-object v4, p0, Lyv1;->r:Li80;

    .line 26
    .line 27
    iget v5, p0, Lyv1;->s:F

    .line 28
    .line 29
    iget v8, p0, Lyv1;->u:I

    .line 30
    .line 31
    invoke-static/range {v0 .. v8}, Lgi1;->c(Lhd3;Ljava/lang/String;Ldx2;Lhs;Li80;FLrg1;II)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lj15;->a:Lj15;

    .line 35
    .line 36
    return-object p0
.end method
