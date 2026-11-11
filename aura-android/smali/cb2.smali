.class public final Lcb2;
.super Ljq;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public g:I

.field public h:I

.field public i:Z


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget v0, p0, Lcb2;->g:I

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget v0, p0, Ljq;->b:I

    .line 6
    .line 7
    if-gtz v0, :cond_1

    .line 8
    .line 9
    iget-object p0, p0, Ljq;->c:[I

    .line 10
    .line 11
    array-length p0, p0

    .line 12
    const/4 v0, 0x3

    .line 13
    if-lt p0, v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string p0, "Contiguous indeterminate animation must be used with 3 or more indicator colors."

    .line 17
    .line 18
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    const-string p0, "Rounded corners are not supported in contiguous indeterminate animation."

    .line 23
    .line 24
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :cond_2
    :goto_0
    return-void
.end method
