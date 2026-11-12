.class public final synthetic Lul2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lxl2;


# instance fields
.field public final synthetic n:Lbm2;

.field public final synthetic o:I

.field public final synthetic p:I

.field public final synthetic q:I


# direct methods
.method public synthetic constructor <init>(Lbm2;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lul2;->n:Lbm2;

    .line 5
    .line 6
    iput p2, p0, Lul2;->o:I

    .line 7
    .line 8
    iput p3, p0, Lul2;->p:I

    .line 9
    .line 10
    iput p4, p0, Lul2;->q:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final d(Lpu1;I)V
    .locals 6

    .line 1
    iget v5, p0, Lul2;->q:I

    .line 2
    .line 3
    iget-object v0, p0, Lul2;->n:Lbm2;

    .line 4
    .line 5
    iget-object v1, v0, Lbm2;->c:Lmm2;

    .line 6
    .line 7
    iget v3, p0, Lul2;->o:I

    .line 8
    .line 9
    iget v4, p0, Lul2;->p:I

    .line 10
    .line 11
    move-object v0, p1

    .line 12
    move v2, p2

    .line 13
    invoke-interface/range {v0 .. v5}, Lpu1;->E0(Lju1;IIII)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
