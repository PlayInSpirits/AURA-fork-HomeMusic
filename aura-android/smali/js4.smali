.class public final Ljs4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;Lra;)V
    .locals 2

    .line 1
    new-instance p2, Lpz1;

    .line 2
    .line 3
    invoke-direct {p2, p1}, Lpz1;-><init>(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ljs4;->a:Landroid/view/View;

    .line 10
    .line 11
    sget-wide p1, Lss4;->b:J

    .line 12
    .line 13
    new-instance v0, Lhe;

    .line 14
    .line 15
    const-string v1, ""

    .line 16
    .line 17
    invoke-direct {v0, v1}, Lhe;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, Lhe;->o:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-static {v0, p1, p2}, Ll93;->r(IJ)J

    .line 27
    .line 28
    .line 29
    sget p1, Lkw1;->e:I

    .line 30
    .line 31
    new-instance p1, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    new-instance p1, Lwc;

    .line 37
    .line 38
    const/16 p2, 0x1c

    .line 39
    .line 40
    invoke-direct {p1, p2, p0}, Lwc;-><init>(ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    sget-object p0, Lb92;->n:Lb92;

    .line 44
    .line 45
    invoke-static {p0, p1}, Lrr2;->K(Lb92;Lgf1;)Lr72;

    .line 46
    .line 47
    .line 48
    new-instance p0, Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    .line 49
    .line 50
    invoke-direct {p0}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;-><init>()V

    .line 51
    .line 52
    .line 53
    new-instance p0, Landroid/graphics/Matrix;

    .line 54
    .line 55
    invoke-direct {p0}, Landroid/graphics/Matrix;-><init>()V

    .line 56
    .line 57
    .line 58
    return-void
.end method
