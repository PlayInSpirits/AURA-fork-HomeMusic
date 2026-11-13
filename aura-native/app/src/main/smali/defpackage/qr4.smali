.class public final Ldefpackage/qr4;
.super Ldefpackage/h12;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic e:Landroid/content/Context;

.field public final synthetic f:Landroid/text/TextPaint;

.field public final synthetic g:Ldefpackage/h12;

.field public final synthetic h:Ldefpackage/rr4;


# direct methods
.method public constructor <init>(Ldefpackage/rr4;Landroid/content/Context;Landroid/text/TextPaint;Ldefpackage/h12;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/qr4;->h:Ldefpackage/rr4;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/qr4;->e:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, Ldefpackage/qr4;->f:Landroid/text/TextPaint;

    .line 9
    .line 10
    iput-object p4, p0, Ldefpackage/qr4;->g:Ldefpackage/h12;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final H(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/qr4;->g:Ldefpackage/h12;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldefpackage/h12;->H(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final I(Landroid/graphics/Typeface;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/qr4;->e:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/qr4;->f:Landroid/text/TextPaint;

    .line 4
    .line 5
    iget-object v2, p0, Ldefpackage/qr4;->h:Ldefpackage/rr4;

    .line 6
    .line 7
    invoke-virtual {v2, v0, v1, p1}, Ldefpackage/rr4;->g(Landroid/content/Context;Landroid/text/TextPaint;Landroid/graphics/Typeface;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Ldefpackage/qr4;->g:Ldefpackage/h12;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Ldefpackage/h12;->I(Landroid/graphics/Typeface;Z)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
