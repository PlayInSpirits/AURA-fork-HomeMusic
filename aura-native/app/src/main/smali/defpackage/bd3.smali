.class public final synthetic Ldefpackage/bd3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/gf1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ldefpackage/gf1;


# direct methods
.method public synthetic constructor <init>(ILdefpackage/gf1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ldefpackage/bd3;->n:I

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/bd3;->o:Ldefpackage/gf1;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Ldefpackage/lm0;

    .line 2
    .line 3
    iget v1, p0, Ldefpackage/bd3;->n:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, Ldefpackage/bd3;->o:Ldefpackage/gf1;

    .line 7
    .line 8
    invoke-direct {v0, v1, v2, p0}, Ldefpackage/lm0;-><init>(IFLdefpackage/gf1;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
