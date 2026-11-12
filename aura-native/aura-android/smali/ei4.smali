.class public final synthetic Lei4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lkc1;


# direct methods
.method public synthetic constructor <init>(ILkc1;)V
    .locals 0

    .line 1
    iput p1, p0, Lei4;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lei4;->b:Lkc1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lei4;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lei4;->b:Lkc1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;

    .line 9
    .line 10
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->q0:Lbl2;

    .line 11
    .line 12
    return-object p0

    .line 13
    :pswitch_0
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;

    .line 14
    .line 15
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->C0:Lii4;

    .line 16
    .line 17
    iget-object p0, p0, Lii4;->h:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 18
    .line 19
    return-object p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
