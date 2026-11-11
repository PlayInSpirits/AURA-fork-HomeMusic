.class public final synthetic Lc73;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:F

.field public final synthetic o:F


# direct methods
.method public synthetic constructor <init>(FF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lc73;->n:F

    .line 5
    .line 6
    iput p2, p0, Lc73;->o:F

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lb24;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lc73;->n:F

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lb24;->c(F)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lb24;->e(F)V

    .line 12
    .line 13
    .line 14
    iget p0, p0, Lc73;->o:F

    .line 15
    .line 16
    invoke-virtual {p1, p0}, Lb24;->b(F)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lj15;->a:Lj15;

    .line 20
    .line 21
    return-object p0
.end method
