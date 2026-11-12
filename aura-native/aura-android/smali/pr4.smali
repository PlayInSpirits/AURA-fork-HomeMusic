.class public final Lpr4;
.super Lau0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic G:Lh12;

.field public final synthetic H:Lrr4;


# direct methods
.method public constructor <init>(Lrr4;Lh12;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpr4;->H:Lrr4;

    .line 5
    .line 6
    iput-object p2, p0, Lpr4;->G:Lh12;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final M(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lpr4;->H:Lrr4;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, v0, Lrr4;->m:Z

    .line 5
    .line 6
    iget-object p0, p0, Lpr4;->G:Lh12;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lh12;->H(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final N(Landroid/graphics/Typeface;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lpr4;->H:Lrr4;

    .line 2
    .line 3
    iget v1, v0, Lrr4;->c:I

    .line 4
    .line 5
    invoke-static {p1, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, v0, Lrr4;->n:Landroid/graphics/Typeface;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    iput-boolean v1, v0, Lrr4;->m:Z

    .line 13
    .line 14
    iget-object p0, p0, Lpr4;->G:Lh12;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p0, p1, v0}, Lh12;->I(Landroid/graphics/Typeface;Z)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
