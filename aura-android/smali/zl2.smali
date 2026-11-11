.class public final synthetic Lzl2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lxl2;
.implements Lr83;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:I

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p3, p0, Lzl2;->p:Ljava/lang/Object;

    .line 2
    .line 3
    iput p1, p0, Lzl2;->n:I

    .line 4
    .line 5
    iput p2, p0, Lzl2;->o:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public d(Lpu1;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lzl2;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lam2;

    .line 4
    .line 5
    iget-object v0, v0, Lam2;->n:Lbm2;

    .line 6
    .line 7
    iget-object v0, v0, Lbm2;->c:Lmm2;

    .line 8
    .line 9
    iget v1, p0, Lzl2;->n:I

    .line 10
    .line 11
    iget p0, p0, Lzl2;->o:I

    .line 12
    .line 13
    invoke-interface {p1, v0, p2, v1, p0}, Lpu1;->Q(Lju1;III)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public x(Landroid/view/View;Lpb5;)Lpb5;
    .locals 2

    .line 1
    iget-object p1, p0, Lzl2;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 4
    .line 5
    sget v0, Lcom/google/android/material/search/SearchView;->Q:I

    .line 6
    .line 7
    invoke-virtual {p2}, Lpb5;->b()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget v1, p0, Lzl2;->n:I

    .line 12
    .line 13
    add-int/2addr v0, v1

    .line 14
    iput v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 15
    .line 16
    invoke-virtual {p2}, Lpb5;->c()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget p0, p0, Lzl2;->o:I

    .line 21
    .line 22
    add-int/2addr v0, p0

    .line 23
    iput v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 24
    .line 25
    return-object p2
.end method
