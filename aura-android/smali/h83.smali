.class public final Lh83;
.super Lfz0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final k0:Lng2;

.field public final l0:F


# direct methods
.method public constructor <init>(Lng2;F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lfz0;-><init>(I)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lh83;->k0:Lng2;

    .line 6
    .line 7
    iput p2, p0, Lh83;->l0:F

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final i()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final j(FFFLkc4;)V
    .locals 1

    .line 1
    iget v0, p0, Lh83;->l0:F

    .line 2
    .line 3
    sub-float/2addr p2, v0

    .line 4
    iget-object p0, p0, Lh83;->k0:Lng2;

    .line 5
    .line 6
    invoke-virtual {p0, p1, p2, p3, p4}, Lng2;->j(FFFLkc4;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
