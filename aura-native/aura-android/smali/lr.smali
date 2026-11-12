.class public final synthetic Llr;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# instance fields
.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:Ldx2;

.field public final synthetic p:Lzs4;

.field public final synthetic q:I

.field public final synthetic r:Z

.field public final synthetic s:I

.field public final synthetic t:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ldx2;Lzs4;IZIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Llr;->n:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Llr;->o:Ldx2;

    .line 7
    .line 8
    iput-object p3, p0, Llr;->p:Lzs4;

    .line 9
    .line 10
    iput p4, p0, Llr;->q:I

    .line 11
    .line 12
    iput-boolean p5, p0, Llr;->r:Z

    .line 13
    .line 14
    iput p6, p0, Llr;->s:I

    .line 15
    .line 16
    iput p7, p0, Llr;->t:I

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    move-object v7, p1

    .line 2
    check-cast v7, Lrg1;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-static {p1}, Lxl;->O(I)I

    .line 11
    .line 12
    .line 13
    move-result v8

    .line 14
    iget-object v0, p0, Llr;->n:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v1, p0, Llr;->o:Ldx2;

    .line 17
    .line 18
    iget-object v2, p0, Llr;->p:Lzs4;

    .line 19
    .line 20
    iget v3, p0, Llr;->q:I

    .line 21
    .line 22
    iget-boolean v4, p0, Llr;->r:Z

    .line 23
    .line 24
    iget v5, p0, Llr;->s:I

    .line 25
    .line 26
    iget v6, p0, Llr;->t:I

    .line 27
    .line 28
    invoke-static/range {v0 .. v8}, Ljz4;->a(Ljava/lang/String;Ldx2;Lzs4;IZIILrg1;I)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lj15;->a:Lj15;

    .line 32
    .line 33
    return-object p0
.end method
