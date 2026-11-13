.class public final Ldefpackage/fv4;
.super Ldefpackage/si0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic g:I

.field public h:Z

.field public i:I

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ldefpackage/gv4;I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ldefpackage/fv4;->g:I

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Ldefpackage/fv4;->j:Ljava/lang/Object;

    iput p2, p0, Ldefpackage/fv4;->i:I

    .line 17
    iput-boolean v0, p0, Ldefpackage/fv4;->h:Z

    return-void
.end method

.method public constructor <init>(Ldefpackage/t75;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ldefpackage/fv4;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ldefpackage/fv4;->j:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, Ldefpackage/fv4;->h:Z

    .line 11
    .line 12
    iput p1, p0, Ldefpackage/fv4;->i:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/fv4;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Ldefpackage/fv4;->h:Z

    .line 9
    .line 10
    return-void

    .line 11
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()V
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/fv4;->g:I

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/fv4;->j:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, Ldefpackage/fv4;->h:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Ldefpackage/fv4;->h:Z

    .line 15
    .line 16
    check-cast v1, Ldefpackage/t75;

    .line 17
    .line 18
    iget-object p0, v1, Ldefpackage/t75;->d:Ldefpackage/u75;

    .line 19
    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    invoke-interface {p0}, Ldefpackage/u75;->b()V

    .line 23
    .line 24
    .line 25
    :cond_1
    :goto_0
    return-void

    .line 26
    :pswitch_0
    check-cast v1, Ldefpackage/gv4;

    .line 27
    .line 28
    iget-object p0, v1, Ldefpackage/gv4;->a:Landroidx/appcompat/widget/Toolbar;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c()V
    .locals 3

    .line 1
    iget v0, p0, Ldefpackage/fv4;->g:I

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/fv4;->j:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget v0, p0, Ldefpackage/fv4;->i:I

    .line 9
    .line 10
    add-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    iput v0, p0, Ldefpackage/fv4;->i:I

    .line 13
    .line 14
    check-cast v1, Ldefpackage/t75;

    .line 15
    .line 16
    iget-object v2, v1, Ldefpackage/t75;->a:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-ne v0, v2, :cond_1

    .line 23
    .line 24
    iget-object v0, v1, Ldefpackage/t75;->d:Ldefpackage/u75;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-interface {v0}, Ldefpackage/u75;->c()V

    .line 29
    .line 30
    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    iput v0, p0, Ldefpackage/fv4;->i:I

    .line 33
    .line 34
    iput-boolean v0, p0, Ldefpackage/fv4;->h:Z

    .line 35
    .line 36
    iput-boolean v0, v1, Ldefpackage/t75;->e:Z

    .line 37
    .line 38
    :cond_1
    return-void

    .line 39
    :pswitch_0
    iget-boolean v0, p0, Ldefpackage/fv4;->h:Z

    .line 40
    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    check-cast v1, Ldefpackage/gv4;

    .line 44
    .line 45
    iget-object v0, v1, Ldefpackage/gv4;->a:Landroidx/appcompat/widget/Toolbar;

    .line 46
    .line 47
    iget p0, p0, Ldefpackage/fv4;->i:I

    .line 48
    .line 49
    invoke-virtual {v0, p0}, Landroid/view/View;->setVisibility(I)V

    .line 50
    .line 51
    .line 52
    :cond_2
    return-void

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
