.class public final Ldefpackage/j01;
.super Ldefpackage/hw;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final j:Ldefpackage/i01;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldefpackage/i01;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ldefpackage/i01;-><init>(Landroid/widget/TextView;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ldefpackage/j01;->j:Ldefpackage/i01;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final J(Z)V
    .locals 1

    .line 1
    invoke-static {}, Ldefpackage/tz0;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object p0, p0, Ldefpackage/j01;->j:Ldefpackage/i01;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Ldefpackage/i01;->J(Z)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final K(Z)V
    .locals 1

    .line 1
    invoke-static {}, Ldefpackage/tz0;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object p0, p0, Ldefpackage/j01;->j:Ldefpackage/i01;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-boolean p1, p0, Ldefpackage/i01;->l:Z

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Ldefpackage/i01;->K(Z)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final R(Landroid/text/method/TransformationMethod;)Landroid/text/method/TransformationMethod;
    .locals 1

    .line 1
    invoke-static {}, Ldefpackage/tz0;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    iget-object p0, p0, Ldefpackage/j01;->j:Ldefpackage/i01;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Ldefpackage/i01;->R(Landroid/text/method/TransformationMethod;)Landroid/text/method/TransformationMethod;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final k([Landroid/text/InputFilter;)[Landroid/text/InputFilter;
    .locals 1

    .line 1
    invoke-static {}, Ldefpackage/tz0;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    iget-object p0, p0, Ldefpackage/j01;->j:Ldefpackage/i01;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Ldefpackage/i01;->k([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final r()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/j01;->j:Ldefpackage/i01;

    .line 2
    .line 3
    iget-boolean p0, p0, Ldefpackage/i01;->l:Z

    .line 4
    .line 5
    return p0
.end method
